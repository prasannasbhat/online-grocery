package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleCustomerNotFound(CustomerNotFoundException exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(GroceryItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleGroceryItemNotFound(GroceryItemNotFoundException exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleOrderNotFound(OrderNotFoundException exception) {
        return exception.getMessage();
    }
}