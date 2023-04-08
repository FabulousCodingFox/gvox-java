package de.fabulousfox.gvox_java.errors;

/**
 * Gets thrown when an error during communication with the c api occurs.
 */
public class GvoxRuntimeError extends RuntimeException {
    public GvoxRuntimeError(String message) {
        super(message);
    }
}
