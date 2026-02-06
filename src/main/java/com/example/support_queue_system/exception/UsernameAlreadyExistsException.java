package com.example.support_queue_system.exception;

public class UsernameAlreadyExistsException extends RuntimeException {
    public UsernameAlreadyExistsException() {
        super("Username already exists");
    }
}
