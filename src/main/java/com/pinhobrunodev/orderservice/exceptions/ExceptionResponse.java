package com.pinhobrunodev.orderservice.exceptions;

public class ExceptionResponse {
    
    private String msg;
    public ExceptionResponse(String msg){
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

}
