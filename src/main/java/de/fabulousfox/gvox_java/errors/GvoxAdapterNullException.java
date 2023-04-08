package de.fabulousfox.gvox_java.errors;

public class GvoxAdapterNullException extends GvoxRuntimeError {
    public GvoxAdapterNullException() {
        super("Gvox adapter is null or hasn't been created before.");
    }
}