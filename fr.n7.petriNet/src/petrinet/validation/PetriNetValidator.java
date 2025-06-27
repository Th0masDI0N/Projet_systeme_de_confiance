package petrinet.validation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petrinet.Arc;
import petrinet.Node;
import petrinet.PetriElement;
import petrinet.PetriNet;
import petrinet.Place;
import petrinet.Transition;
import petrinet.util.PetrinetSwitch;
import petrinet.validation.ValidationResult;
import petrinet.validation.ValidationResult.Entry;
import petrinet.PetrinetPackage;

/**
 * Valide un modèle PetriNet et produit un ValidationResult.
 */
public class PetriNetValidator {

    /**
     * Valide un Resource EMF dont la racine est un PetriNet.
     */
    public ValidationResult validate(Resource resource) {
        EObject root = resource.getContents().get(0);
        if (!(root instanceof PetriNet)) {
            throw new IllegalArgumentException(
                "Le modèle ne contient pas de PetriNet en racine");
        }
        return validate((PetriNet) root);
    }

    /**
     * Valide directement une instance PetriNet.
     */
    public ValidationResult validate(PetriNet net) {
        ValidationResult result = new ValidationResult();
        new ValidationSwitch(result).doSwitch(net);
        return result;
    }

    /**
     * Switch EMF pour dispatcher les validations par type.
     */
    private static class ValidationSwitch extends PetrinetSwitch<Void> {
        private final ValidationResult result;

        ValidationSwitch(ValidationResult result) {
            this.result = result;
        }

        @Override
        public Void casePetriNet(PetriNet net) {
            // Nom du réseau valide
            if (net.getName() == null || net.getName().trim().isEmpty()) {
                result.addError(net, "Le nom du PetriNet est vide");
            }

            // Unicité des Node par nom
            List<Node> nodes = net.getPetriElements().stream()
                .filter(e -> e instanceof Node)
                .map(e -> (Node) e)
                .collect(Collectors.toList());
            Map<String, List<Node>> byName = nodes.stream()
                .collect(Collectors.groupingBy(n -> n.getName()));
            byName.forEach((name, list) -> {
                if (name == null || name.trim().isEmpty()) return;
                if (list.size() > 1) {
                    list.forEach(n -> result.addError(n,
                        "Doublon de Node avec le nom '" + name + "'"));
                }
            });

            // Arcs redondants
            List<Arc> arcs = net.getPetriElements().stream()
                .filter(e -> e instanceof Arc)
                .map(e -> (Arc) e)
                .collect(Collectors.toList());
            Map<String, List<Arc>> byEndpoints = arcs.stream()
                .collect(Collectors.groupingBy(a ->
                    a.getSource().getName() + "->" + a.getTarget().getName()));
            byEndpoints.forEach((key, list) -> {
                if (list.size() > 1) {
                    list.forEach(a -> result.addError(a,
                        "Arc redondant pour la même source/target '" + key + "'"));
                }
            });

            // On descend explicitement dans chaque sous-élément
            net.getPetriElements().forEach(e -> doSwitch((EObject) e));

            return null;
        }

        @Override
        public Void casePlace(Place place) {
            // Marquage >= 0
            if (place.getMarking() < 0) {
                result.addError(place,
                    "Marquage négatif (" + place.getMarking() + ")");
            }
            // Nom valide
            if (place.getName() == null || place.getName().trim().isEmpty()) {
                result.addError(place, "Le nom du Node est vide");
            }
            return null;
        }

        @Override
        public Void caseTransition(Transition trans) {
            // Nom valide
            if (trans.getName() == null || trans.getName().trim().isEmpty()) {
                result.addError(trans, "Le nom du Node est vide");
            }
            return null;
        }

        @Override
        public Void caseArc(Arc arc) {
            // Poids strictement positif
            if (arc.getWeight() <= 0) {
                result.addError(arc,
                    "Le poids de l'Arc doit être strictement positif (actuel=" + arc.getWeight() + ")");
            }
            // Position valide : entre Place et Transition
            EObject src = arc.getSource();
            EObject tgt = arc.getTarget();
            if (!((src instanceof Place && tgt instanceof Transition)
                || (src instanceof Transition && tgt instanceof Place))) {
                result.addError(arc,
                    "L'Arc doit relier une Place et une Transition");
            }
            // Même PetriNet
            if (((PetriElement) arc.getSource()).getPetrinet()
                    != ((PetriElement) arc.getTarget()).getPetrinet()) {
                result.addError(arc,
                    "La source et la destination de l'Arc ne sont pas dans le même PetriNet");
            }
            // ReadArc non depuis Transition
            if (arc.isIsReadArc() && arc.getSource() instanceof Transition) {
                result.addError(arc,
                    "Un Arc partant d'une Transition ne peut pas être un ReadArc");
            }
            return null;
        }
    }
}
