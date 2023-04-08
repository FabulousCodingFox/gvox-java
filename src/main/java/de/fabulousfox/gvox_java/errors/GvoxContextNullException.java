package de.fabulousfox.gvox_java.errors;

public class GvoxContextNullException extends RuntimeException{
    public GvoxContextNullException() {
        super("Gvox context is null or hasn't been created before.");
    }
}
