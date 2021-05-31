package com.pinhobrunodev.orderservice.exceptions;

import com.pinhobrunodev.orderservice.utils.MessageUtils;

public class NameNotFoundException  extends RuntimeException {
    
    public NameNotFoundException(){
        super(MessageUtils.NOME_NAO_EXISTE);
    }
}
