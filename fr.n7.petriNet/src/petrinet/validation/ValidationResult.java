package petrinet.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Collecte des erreurs et warnings de validation pour PetriNet.
 */
public class ValidationResult {
    /**
     * Représente une entrée de validation (erreur ou warning).
     */
    public static class Entry {
        public final EObject element;
        public final String message;
        public final boolean isError;

        public Entry(EObject element, String message, boolean isError) {
            this.element = element;
            this.message = message;
            this.isError = isError;
        }

        @Override
        public String toString() {
            return (isError ? "ERROR: " : "WARNING: ") + message +
                   " (in " + element.eClass().getName() + ")";
        }
    }

    private final List<Entry> entries = new ArrayList<>();

    /**
     * Ajoute une erreur pour l'élément donné.
     */
    public void addError(EObject element, String message) {
        entries.add(new Entry(element, message, true));
    }

    /**
     * Ajoute un warning pour l'élément donné.
     */
    public void addWarning(EObject element, String message) {
        entries.add(new Entry(element, message, false));
    }

    /**
     * Retourne toutes les entrées (erreurs et warnings).
     */
    public List<Entry> getEntries() {
        return Collections.unmodifiableList(entries);
    }

    /**
     * Retourne uniquement les erreurs.
     */
    public List<Entry> getErrors() {
        return entries.stream()
                      .filter(e -> e.isError)
                      .collect(Collectors.toList());
    }

    /**
     * Retourne uniquement les warnings.
     */
    public List<Entry> getWarnings() {
        return entries.stream()
                      .filter(e -> !e.isError)
                      .collect(Collectors.toList());
    }

    /**
     * Retourne les entrées dont l'élément appartient exactement à la EClass spécifiée.
     */
    public List<Entry> getRecordedEntriesFor(EClass eClass) {
        return entries.stream()
                      .filter(e -> e.element.eClass() == eClass)
                      .collect(Collectors.toList());
    }
}
