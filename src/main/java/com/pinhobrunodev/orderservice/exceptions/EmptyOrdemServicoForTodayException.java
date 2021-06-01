package com.pinhobrunodev.orderservice.exceptions;

import com.pinhobrunodev.orderservice.utils.MessageUtils;

public class EmptyOrdemServicoForTodayException extends RuntimeException {

    public EmptyOrdemServicoForTodayException(){
        super(MessageUtils.NAO_EXISTE_ORDEM_DE_SERVICO_PARA_ESTA_DATA);
    }

}
    
