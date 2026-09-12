package com.example.demo.exception;

public class GroceryItemNotFoundException extends RuntimeException {

    public GroceryItemNotFoundException(String message) {
        super(message);
    }
}
