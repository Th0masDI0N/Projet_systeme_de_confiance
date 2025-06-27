package petrinet.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.PetriNet;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.validation.ValidationResult.Entry;

/**
 * Réalise la validation de modèles conformes à PetriNet
 * et affiche le résultat, à la manière de ValidateSimplepdl.
 */
public class ValidatePetriNet {
	
    /**
     * Affiche une liste d'erreurs (ou "OK" si elle est vide).
     */
    private static void afficherErreurs(String prefix, List<Entry> errors) {
        System.out.print(prefix + ":");
        if (errors.isEmpty()) {
            System.out.println(" OK");
        } else {
            System.out.println(" " + errors.size() + " erreur(s)");
            for (Entry err : errors) {
                EObject eObj = err.element;
                String type = eObj.eClass().getName();
                System.out.println("=> [" + type + "] " + err.message);
            }
        }
    }
    
    /**
     * Regroupe et affiche les erreurs par type d'élément.
     */
    private static void afficherResultat(ValidationResult result) {
        // On passe directement les EClass littérales du petrinet
        afficherErreurs("- PetriNet",
            result.getRecordedEntriesFor(PetrinetPackage.Literals.PETRI_NET));
        afficherErreurs("- Place",
            result.getRecordedEntriesFor(PetrinetPackage.Literals.PLACE));
        afficherErreurs("- Transition",
            result.getRecordedEntriesFor(PetrinetPackage.Literals.TRANSITION));
        afficherErreurs("- Arc",
            result.getRecordedEntriesFor(PetrinetPackage.Literals.ARC));
    }

    public static void main(String... args) {
        // 0. Force le chargement du méta-modèle
        @SuppressWarnings("unused")
        PetrinetPackage pkg = PetrinetPackage.eINSTANCE;
        
        // 1. Enregistrement du factory XMI
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String,Object> extToFactory = reg.getExtensionToFactoryMap();
        extToFactory.put("xmi", new XMIResourceFactoryImpl());
        
        // 2. Enregistrement du NS-URI pour le lancement Java simple
        EPackage.Registry.INSTANCE.put(
            PetrinetPackage.eNS_URI,
            PetrinetPackage.eINSTANCE
        );
        
        // 3. Création du ResourceSet
        ResourceSet resSet = new ResourceSetImpl();
        PetriNetValidator validator = new PetriNetValidator();
        
        // 4. Pour chaque fichier .xmi passé en argument
        for (String path : args) {
            URI uri = URI.createFileURI(path);
            Resource resource = resSet.getResource(uri, true);

            ValidationResult result = validator.validate(resource);

            System.out.println("\n=== Validation de " + path + " ===");
            afficherResultat(result);
        }

        
        System.out.println("\nFini.");
    }
}
