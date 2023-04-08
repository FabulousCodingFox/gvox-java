package de.fabulousfox.gvox_java.errors;

public class GvoxAdapterContextNullException extends GvoxRuntimeError {
    public GvoxAdapterContextNullException() {
        super("Gvox adapter context is null or hasn't been created before.");
    }

    public GvoxAdapterContextNullException(String message) {
        super("Gvox adapter context is null or hasn't been created before (" + message + ")");
    }
}
