package org.example.customExceptions;

public class InvalidNumberException extends Exception {
    public InvalidNumberException() {
        super("Invalid input! Please input a valid number.");
    }
}