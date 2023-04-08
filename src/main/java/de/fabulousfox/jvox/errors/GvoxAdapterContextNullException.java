package de.fabulousfox.jvox.errors;

public class GvoxAdapterContextNullException extends RuntimeException{
    public GvoxAdapterContextNullException() {
        super("Gvox adapter context is null or hasn't been created before.");
    }

    public GvoxAdapterContextNullException(String message) {
        super("Gvox adapter context is null or hasn't been created before ("+message+")");
    }
}
