package com.example.support_queue_system.exception;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException() {
        super("Invalid username or password");
    }
}
