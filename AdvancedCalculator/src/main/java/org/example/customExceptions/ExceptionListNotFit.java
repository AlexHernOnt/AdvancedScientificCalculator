package org.example.customExceptions;

public class ExceptionListNotFit extends RuntimeException {
    public ExceptionListNotFit() {
        super("List must contain at least two numbers.");
    }
}
