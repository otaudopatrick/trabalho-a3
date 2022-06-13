package com.trabalhoa3.delivery.domain.exceptions;

public class UserExistsException extends RuntimeException {
    public UserExistsException(String msg) {
        super(msg);
    }
}
