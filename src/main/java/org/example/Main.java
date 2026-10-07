package org.example;

public class Main {
    public static void main(String[] args) {
        class InvalidPurchaseException extends RuntimeException {
            public InvalidPurchaseException(String message) {
                super(message);
            }
        }
    }
}