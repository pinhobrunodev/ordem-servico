package com.pinhobrunodev.orderservice.mapper;

import java.time.Instant;

import com.pinhobrunodev.orderservice.model.OrdemServico;
import com.pinhobrunodev.orderservice.model.dto.OrdemServicoDTO;
import com.pinhobrunodev.orderservice.model.dto.OrdemServicoInsertDTO;
import com.pinhobrunodev.orderservice.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrdemServicoMapper {

    @Autowired
    private ClienteRepository repository;

    public OrdemServico toEntity(OrdemServicoInsertDTO dto) {
        OrdemServico entity = new OrdemServico();
        entity.setId(dto.getId());
        entity.setDescricao(dto.getDescricao());
        entity.setDataAbertuda(Instant.now());
        entity.setDataFinalizacao(dto.getData_finalizacao());
        entity.setPreco(dto.getPreco());
        entity.setStatus(dto.getStatus_ordem_servico());
        /**
         * Instancio o cliente pelo id
         */
        entity.setCliente(repository.getOne(dto.getId()));
        return entity;
    }

  
    public OrdemServicoDTO toOrdemServicoDTO(OrdemServico entity){
        OrdemServicoDTO dto = new OrdemServicoDTO();
        dto.setId(entity.getId());
        dto.setDescricao(entity.getDescricao());
        dto.setClienteName(entity.getCliente().getNome());
        dto.setClienteTelefone(entity.getCliente().getTelefone());
        dto.setData_abertura(entity.getDataAbertura());
        dto.setData_finalizacao(entity.getDataFinalizacao());
        dto.setComentarios(entity.getComentarios());
        dto.setPreco(entity.getPreco());
        dto.setStatus_ordem_servico(entity.getStatus());
        return dto;
    }

}
