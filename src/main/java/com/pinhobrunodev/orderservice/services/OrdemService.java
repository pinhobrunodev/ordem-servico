package com.pinhobrunodev.orderservice.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pinhobrunodev.orderservice.mapper.OrdemServicoMapper;
import com.pinhobrunodev.orderservice.model.OrdemServico;
import com.pinhobrunodev.orderservice.model.dto.OrdemServicoDTO;
import com.pinhobrunodev.orderservice.model.dto.OrdemServicoInsertDTO;
import com.pinhobrunodev.orderservice.repositories.OrdemServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrdemService {

    @Autowired
    private OrdemServicoRepository repository;
    @Autowired
    private OrdemServicoMapper mapper;

    @Transactional
    public OrdemServicoDTO save(OrdemServicoInsertDTO dto) {
        // TODO EXCEPTIONS

        OrdemServico entity = mapper.toEntity(dto);
        repository.save(entity);
        return mapper.toOrdemServicoDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<OrdemServicoDTO> findAll() {
        return repository.findAll().stream().map(x -> new OrdemServicoDTO(x)).collect(Collectors.toList());
    }

}
