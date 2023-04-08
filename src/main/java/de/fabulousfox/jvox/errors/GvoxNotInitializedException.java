package de.fabulousfox.jvox.errors;

public class GvoxNotInitializedException extends RuntimeException {
    public GvoxNotInitializedException() {
        super("Gvox has not been initialized. Call Gvox.createCapabilities() before using any other Gvox methods.");
    }
}
