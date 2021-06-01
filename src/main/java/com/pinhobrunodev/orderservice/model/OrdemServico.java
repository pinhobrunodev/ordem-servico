package com.pinhobrunodev.orderservice.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.pinhobrunodev.orderservice.model.enums.StatusOrdemServico;

@Entity
@Table(name = "tb_ordem_servico")
public class OrdemServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double preco;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant data_abertura;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant data_finalizacao;
    private StatusOrdemServico status_ordem_servico;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    

    public OrdemServico() {
    }

    
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public Instant getDataAbertura() {
        return data_abertura;
    }

    public Instant getDataFinalizacao() {
        return data_finalizacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDataAbertuda(Instant dataAbertuda) {
        this.data_abertura = dataAbertuda;
    }

    public StatusOrdemServico getStatus() {
        return status_ordem_servico;
    }

    public void setStatus(StatusOrdemServico status) {
        this.status_ordem_servico = status;
    }

    public void setDataFinalizacao(Instant dataFinalizacao) {
        this.data_finalizacao = dataFinalizacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }



}
