package simplepdl.validation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.RessourceAllocation;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.util.SimplepdlSwitch;

/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class SimplePDLValidator extends SimplepdlSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public SimplePDLValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcess(simplepdl.Process process) {
	    // … vos validations Process existantes …

	    // 1. Récupérer *toutes* les RessourceAllocation
	    Map<Ressource, Integer> totalAlloc = new HashMap<>();
	    process.getProcessElements().stream()
	        // on ne garde que les WorkDefinition
	        .filter(pe -> pe instanceof WorkDefinition)
	        .map(pe -> (WorkDefinition) pe)
	        // pour chacune, on parcourt ses allocations
	        .flatMap(wd -> wd.getResourceUsages().stream())
	        .forEach(alloc -> {
	            Ressource r = alloc.getRessource();
	            int sum = totalAlloc.getOrDefault(r, 0) + alloc.getQuantity();
	            totalAlloc.put(r, sum);
	        });

	    // 2. Reporter une erreur si somme > capacité
	    totalAlloc.forEach((r, sum) -> {
	        if (sum > r.getQuantity()) {
	            result.recordIfFailed(
	                false,
	                r,
	                "La somme des allocations (" + sum + 
	                ") dépasse la capacité disponible de la ressource \"" +
	                r.getName() + "\" (" + r.getQuantity() + ")"
	            );
	        }
	    });

	    // 3. On poursuit toujours la visite des enfants
	    for (ProcessElement pe : process.getProcessElements()) {
	        this.doSwitch(pe);
	    }
	    return null;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un ProcessElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkDefinition(WorkDefinition object) {
		// Contraintes sur WD
		this.result.recordIfFailed(
				object.getName() != null || object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'activité ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_DEFINITION)
					.allMatch(pe -> (pe.equals(object) || !((WorkDefinition) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de l'activité (" + object.getName() + ") n'est pas unique");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkSequence.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkSequence(WorkSequence object) {
		// Contraintes sur WS
		this.result.recordIfFailed(
				!object.getPredecessor().equals(object.getSuccessor()), 
				object,
				"La dépendance relie l'activité " + object.getPredecessor().getName() + " à elle-même");
		
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(pe -> pe instanceof WorkSequence)
					.map(ws -> (WorkSequence) ws)
					.filter(ws -> ws != object) // évite de se comparer à soi-même
					.noneMatch(ws ->
						ws.getPredecessor().equals(object.getPredecessor()) &&
						ws.getSuccessor().equals(object.getSuccessor()) &&
						ws.getLinkType().equals(object.getLinkType())
					),
				object,
				"Une dépendance identique (même type entre les mêmes activités) existe déjà : " +
				object.getPredecessor().getName() + " --" + object.getLinkType() + "--> " + object.getSuccessor().getName()
			);

		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Guidance.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseGuidance(Guidance object) {
		this.result.recordIfFailed(
			object.getText() != null && !object.getText().isBlank(),
			object,
			"Le texte de la guidance ne doit pas être vide."
		);
		return null;
	}


	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	@Override
	public Boolean caseRessource(Ressource object) {
		// Vérifie que le nom est bien formé
		this.result.recordIfFailed(
			object.getName() != null && object.getName().matches(IDENT_REGEX),
			object,
			"Le nom de la ressource ne respecte pas les conventions Java"
		);

		// Vérifie que le nom est unique dans le même processus
		this.result.recordIfFailed(
			object.getProcess().getProcessElements().stream()
				.filter(pe -> pe instanceof Ressource)
				.map(pe -> (Ressource) pe)
				.allMatch(r -> r == object || !r.getName().equals(object.getName())),
			object,
			"Le nom de la ressource (" + object.getName() + ") n'est pas unique dans le processus"
		);

		return null;
	}
	
	@Override
	public Boolean caseRessourceAllocation(RessourceAllocation object) {
		// Quantité allouée doit être > 0
		this.result.recordIfFailed(
			object.getQuantity() > 0,
			object,
			"La quantité allouée doit être strictement positive"
		);

		// La ressource doit être non nulle
		this.result.recordIfFailed(
			object.getRessource() != null,
			object,
			"La ressource allouée ne peut pas être nulle"
		);

		// La tâche (WorkDefinition) doit être non nulle
		this.result.recordIfFailed(
			object.getTask() != null,
			object,
			"La tâche associée ne peut pas être nulle"
		);

		// La quantité allouée ne doit pas dépasser la quantité disponible
		if (object.getRessource() != null) {
			this.result.recordIfFailed(
				object.getQuantity() <= object.getRessource().getQuantity(),
				object,
				"La quantité allouée (" + object.getQuantity() + ") dépasse la capacité disponible de la ressource (" + object.getRessource().getQuantity() + ")"
			);
		}

		return null;
	}



	
	
}
