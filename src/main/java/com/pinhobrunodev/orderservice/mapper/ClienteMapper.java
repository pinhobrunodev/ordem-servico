package com.pinhobrunodev.orderservice.mapper;

import com.pinhobrunodev.orderservice.model.Cliente;
import com.pinhobrunodev.orderservice.model.dto.ClienteDTO;

import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    
    public Cliente toEntity(ClienteDTO dto){
        Cliente entity = new Cliente();
        entity.setNome(dto.getNome());
        entity.setTelefone(dto.getTelefone());
        return entity;
    }

    public ClienteDTO toClientDTO(Cliente entity){
        ClienteDTO dto = new ClienteDTO();
        dto.setNome(entity.getNome());
        dto.setTelefone(entity.getTelefone());
        return dto;
    }

}
