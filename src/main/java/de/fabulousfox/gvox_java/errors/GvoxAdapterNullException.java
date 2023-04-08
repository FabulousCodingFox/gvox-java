package de.fabulousfox.gvox_java.errors;

/**
 * Gets thrown when the GvoxAdapter is null or hasn't been created before.
 */
public class GvoxAdapterNullException extends GvoxRuntimeError {
    public GvoxAdapterNullException() {
        super("Gvox adapter is null or hasn't been created before.");
    }
}
