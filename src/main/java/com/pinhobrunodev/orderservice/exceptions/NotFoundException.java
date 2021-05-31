package com.pinhobrunodev.orderservice.exceptions;

import com.pinhobrunodev.orderservice.utils.MessageUtils;

public class NotFoundException extends RuntimeException {
    
    public NotFoundException(){
        super(MessageUtils.CLIENTE_NAO_ENCONTRADO);
    }
}
