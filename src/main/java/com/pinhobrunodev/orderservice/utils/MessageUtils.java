package com.pinhobrunodev.orderservice.utils;

import java.time.Instant;

public abstract class MessageUtils {
    
    public static final String CLIENTE_JA_EXISTENTE = "Cliente ja esta cadastrado no sistema";
    public static final String TELEFONE_JA_CADASTRADO = "Telefone ja cadastrado";
    public static final String CLIENTE_NAO_ENCONTRADO = "Cliente nao encontrado";
    public static final String NOME_NAO_EXISTE = "Nome nao existe";
    public static final String NAO_EXISTE_ORDEM_DE_SERVICO_PARA_ESTA_DATA = "Sem ordens de serviço para a data de hoje : "+Instant.now();
    
    

}
