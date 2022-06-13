package com.trabalhoa3.delivery.domain.exceptions;

public class UserNotExistsException extends RuntimeException {
    public UserNotExistsException(String msg) {
        super(msg);
    }
}
