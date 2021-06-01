package com.pinhobrunodev.orderservice.model.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.pinhobrunodev.orderservice.model.OrdemServico;
import com.pinhobrunodev.orderservice.model.enums.StatusOrdemServico;
import org.springframework.stereotype.Component;
@Component
public class OrdemServicoInsertDTO {


    private String descricao;
    private Double preco;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant data_finalizacao;
    private StatusOrdemServico status_ordem_servico;
    private Long ClienteId;

    public OrdemServicoInsertDTO() {
    }

    // toDTO()
    public OrdemServicoInsertDTO(OrdemServico entity) {
        descricao = entity.getDescricao();
        preco = entity.getPreco();
        data_finalizacao = entity.getDataFinalizacao();
        status_ordem_servico = entity.getStatus();
        ClienteId = entity.getCliente().getId();
    }

    public Long getClienteId() {
        return ClienteId;
    }

    public Instant getData_finalizacao() {
        return data_finalizacao;
    }


    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public StatusOrdemServico getStatus_ordem_servico() {
        return status_ordem_servico;
    }

    public void setClienteId(Long clienteId) {
        ClienteId = clienteId;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setStatus_ordem_servico(StatusOrdemServico status_ordem_servico) {
        this.status_ordem_servico = status_ordem_servico;
    }



    public void setData_finalizacao(Instant data_finalizacao) {
        this.data_finalizacao = data_finalizacao;
    }

}
