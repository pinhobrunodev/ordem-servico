package com.pinhobrunodev.orderservice.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.pinhobrunodev.orderservice.exceptions.BusinessException;
import com.pinhobrunodev.orderservice.exceptions.NameNotFoundException;
import com.pinhobrunodev.orderservice.exceptions.NotFoundException;
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

    @Transactional
    public ClienteDTO update(ClienteDTO dto) {
        Optional<Cliente> optional = repository.findByClienteUpdate(dto.getNome(), dto.getTelefone(), dto.getId());
        Optional<Cliente> optional2 = repository.findById(dto.getId());

        if (optional.isPresent()) {
            throw new BusinessException(MessageUtils.CLIENTE_JA_EXISTENTE);
        }
        if (!optional2.isPresent()) {
            throw new NotFoundException();
        }
        Cliente entity = mapper.toEntity(dto);
        repository.save(entity);
        return mapper.toClientDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        Optional<Cliente> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw new NotFoundException();
        }
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<ClienteDTO> findAll() {
        return repository.findAll().stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {
        return repository.findById(id).map(x -> new ClienteDTO(x)).orElseThrow(NotFoundException::new);
    }

    @Transactional(readOnly = true)
    public ClienteDTO findByNome(String name) {
        return repository.findByNome(name.substring(0,1).toUpperCase().concat(name.substring(1))).map(x -> new ClienteDTO(x)).orElseThrow(NameNotFoundException::new);
    }

}
