package com.pinhobrunodev.orderservice.exceptions;

public class BusinessException extends RuntimeException {

    public BusinessException(String msg) {
        super(msg);
    }
}
