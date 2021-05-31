package com.pinhobrunodev.orderservice.mapper;

import com.pinhobrunodev.orderservice.model.Comentario;
import com.pinhobrunodev.orderservice.model.dto.ComentarioDTO;
import com.pinhobrunodev.orderservice.repositories.OrdemServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ComentarioMapper {
    
    @Autowired
    private OrdemServicoRepository repository;

    public Comentario toEntity(ComentarioDTO dto){
        Comentario entity = new Comentario();
        entity.setId(dto.getId());
        entity.setDescricao(dto.getDescricao());
        entity.setOrdemServico(repository.getOne(dto.getId()));
        return entity;
    }

}
