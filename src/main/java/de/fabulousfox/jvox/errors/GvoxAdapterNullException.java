package de.fabulousfox.jvox.errors;

public class GvoxAdapterNullException extends RuntimeException{
    public GvoxAdapterNullException() {
        super("Gvox adapter is null or hasn't been created before.");
    }
}
