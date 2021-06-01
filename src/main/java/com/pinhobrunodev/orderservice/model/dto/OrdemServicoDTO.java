package com.pinhobrunodev.orderservice.model.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.pinhobrunodev.orderservice.model.Comentario;
import com.pinhobrunodev.orderservice.model.OrdemServico;
import com.pinhobrunodev.orderservice.model.enums.StatusOrdemServico;
import org.springframework.stereotype.Component;
@Component
public class OrdemServicoDTO {
    
    private Long id;
    private String descricao;
    private Double preco;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant data_abertura;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant data_finalizacao;
    private StatusOrdemServico status_ordem_servico;
    private String clienteName;
    private String clienteTelefone;
    private List<Comentario> comentarios = new ArrayList<Comentario>();

    public OrdemServicoDTO(){}

    public OrdemServicoDTO(OrdemServico entity){
        id = entity.getId();
        descricao = entity.getDescricao();
        preco = entity.getPreco();
        data_abertura = entity.getDataAbertura();
        data_finalizacao = entity.getDataFinalizacao();
        status_ordem_servico = entity.getStatus();
        clienteName = entity.getCliente().getNome();
        clienteTelefone = entity.getCliente().getTelefone();
    }

    public String getClienteName() {
        return clienteName;
    }
    public String getClienteTelefone() {
        return clienteTelefone;
    }
    public List<Comentario> getComentarios() {
        return comentarios;
    }
    public Instant getData_abertura() {
        return data_abertura;
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
    public Long getId() {
        return id;
    }
    public StatusOrdemServico getStatus_ordem_servico() {
        return status_ordem_servico;
    }
    public void setClienteTelefone(String clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }
    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }
    public void setData_abertura(Instant data_abertura) {
        this.data_abertura = data_abertura;
    }
    public void setData_finalizacao(Instant data_finalizacao) {
        this.data_finalizacao = data_finalizacao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void setStatus_ordem_servico(StatusOrdemServico status_ordem_servico) {
        this.status_ordem_servico = status_ordem_servico;
    }


}
