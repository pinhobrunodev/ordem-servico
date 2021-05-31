package com.pinhobrunodev.orderservice.model.dto;

import com.pinhobrunodev.orderservice.model.Comentario;

import org.springframework.stereotype.Component;
@Component
public class ComentarioDTO {
    

    private Long id;
    private String descricao;
    private Long ordemServicoID;

    public ComentarioDTO(){}

    public ComentarioDTO(Comentario entity) {
        id = entity.getId();
        descricao = entity.getDescricao();
        ordemServicoID = entity.getOrdemServico().getId();
    }

    public String getDescricao() {
        return descricao;
    }
    public Long getId() {
        return id;
    }
    public Long getOrdemServicoID() {
        return ordemServicoID;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setOrdemServicoID(Long ordemServicoID) {
        this.ordemServicoID = ordemServicoID;
    }
    
}
