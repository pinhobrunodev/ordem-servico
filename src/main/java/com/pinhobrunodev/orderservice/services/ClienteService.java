package com.pinhobrunodev.orderservice.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.pinhobrunodev.orderservice.exceptions.BusinessException;
import com.pinhobrunodev.orderservice.mapper.ClienteMapper;
import com.pinhobrunodev.orderservice.model.Cliente;
import com.pinhobrunodev.orderservice.model.dto.ClienteDTO;
import com.pinhobrunodev.orderservice.repositories.ClienteRepository;
import com.pinhobrunodev.orderservice.utils.MessageUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;
    @Autowired
    private ClienteMapper mapper;

    @Transactional(readOnly = true)
    public List<ClienteDTO> findAll() {
        return repository.findAll().stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public ClienteDTO save(ClienteDTO dto) {
        Optional<Cliente> optional = repository.findByNomeAndTelefone(dto.getNome(), dto.getTelefone());
        Optional<Cliente> optional2 = repository.findByTelefone(dto.getTelefone());
        if (optional.isPresent()) {
            throw new BusinessException(MessageUtils.CLIENTE_JA_EXISTENTE);
        }
        if (optional2.isPresent()) {
            throw new BusinessException(MessageUtils.TELEFONE_JA_CADASTRADO);

        }
        Cliente entity = mapper.toEntity(dto);
        repository.save(entity);
        return mapper.toClientDTO(entity);

    }

}
