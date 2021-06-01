package com.pinhobrunodev.orderservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_comentario")
public class Comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemServico ordem_servico;

    public Comentario() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    @JsonIgnore
    public OrdemServico getOrdemServico() {
        return ordem_servico;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordem_servico = ordemServico;
    }

}
