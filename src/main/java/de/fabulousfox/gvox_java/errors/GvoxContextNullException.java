package de.fabulousfox.gvox_java.errors;

public class GvoxContextNullException extends GvoxRuntimeError {
    public GvoxContextNullException() {
        super("Gvox context is null or hasn't been created before.");
    }
}
