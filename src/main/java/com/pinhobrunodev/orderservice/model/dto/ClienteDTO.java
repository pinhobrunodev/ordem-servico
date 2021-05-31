package com.pinhobrunodev.orderservice.model.dto;

import java.io.Serializable;

import com.pinhobrunodev.orderservice.model.Cliente;

import org.springframework.stereotype.Component;

@Component
public class ClienteDTO implements Serializable {

    private Long id;
    private String nome;
    private String telefone;

    public ClienteDTO() {
        
    }


    //  Entity ja foi salva (ja possui ID)
    public ClienteDTO(Cliente entity) {
        id = entity.getId();
        nome = entity.getNome();
        telefone = entity.getTelefone();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }
}
