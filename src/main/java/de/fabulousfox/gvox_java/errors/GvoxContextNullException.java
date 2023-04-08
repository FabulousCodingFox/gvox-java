package de.fabulousfox.gvox_java.errors;

/**
 * Gets thrown when the GvoxAdapter is null or hasn't been created before.
 */
public class GvoxContextNullException extends GvoxRuntimeError {
    public GvoxContextNullException() {
        super("Gvox context is null or hasn't been created before.");
    }
}
