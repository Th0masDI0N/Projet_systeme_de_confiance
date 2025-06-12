package simplepdl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplepdl.*;
import simplepdl.Process;

import java.util.HashMap;
import java.util.Map;

public class SimplePDLValidator {

    public ValidationResult validate(Resource resource) {
        ValidationResult resultat = new ValidationResult();

        for (EObject eObject : resource.getContents()) {
            if (eObject instanceof Process) {
                Process process = (Process) eObject;
                validateProcess(process, resultat);
            }
        }

        return resultat;
    }

    private void validateProcess(Process process, ValidationResult resultat) {
        // Vérification des Guidance
        process.getProcessElements().stream()
            .filter(pe -> pe instanceof Guidance)
            .map(pe -> (Guidance) pe)
            .forEach(guidance -> {
                boolean isValid = guidance.getText() != null && !guidance.getText().trim().isEmpty();
                resultat.recordIfFailed(isValid, guidance, "Guidance text is empty");
            });

        // Vérification des dépendances dupliquées
        Map<WorkSequenceKey, Boolean> workSequenceMap = new HashMap<>();
        process.getProcessElements().stream()
            .filter(pe -> pe instanceof WorkSequence)
            .map(pe -> (WorkSequence) pe)
            .forEach(workSequence -> {
                WorkDefinition predecessor = workSequence.getPredecessor();
                WorkDefinition successor = workSequence.getSuccessor();

                // Vérifiez que les prédécesseurs et successeurs ne sont pas null
                if (predecessor != null && successor != null) {
                    WorkSequenceKey key = new WorkSequenceKey(predecessor, successor, workSequence.getLinkType());
                    if (workSequenceMap.containsKey(key)) {
                        resultat.recordError(workSequence, "Duplicate dependency found");
                    } else {
                        workSequenceMap.put(key, true);
                    }
                } else {
                    resultat.recordError(workSequence, "Predecessor or successor is null");
                }
            });
    }

    // Classe utilitaire pour créer une clé unique pour les dépendances
    private class WorkSequenceKey {
        private WorkDefinition predecessor;
        private WorkDefinition successor;
        private WorkSequenceType linkType;

        public WorkSequenceKey(WorkDefinition predecessor, WorkDefinition successor, WorkSequenceType linkType) {
            this.predecessor = predecessor;
            this.successor = successor;
            this.linkType = linkType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            WorkSequenceKey that = (WorkSequenceKey) o;
            return predecessor.equals(that.predecessor) &&
                   successor.equals(that.successor) &&
                   linkType == that.linkType;
        }

        @Override
        public int hashCode() {
            return predecessor.hashCode() + successor.hashCode() + linkType.hashCode();
        }
    }
}
