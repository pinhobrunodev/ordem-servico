package com.pinhobrunodev.orderservice.repositories;

import java.util.Optional;

import com.pinhobrunodev.orderservice.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

    Optional<Cliente> findByNomeAndTelefone(String nome, String telefone);

    Optional<Cliente> findByTelefone(String telefone);
    
}
