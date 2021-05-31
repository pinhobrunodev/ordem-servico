package com.pinhobrunodev.orderservice.repositories;

import java.util.Optional;

import com.pinhobrunodev.orderservice.model.Cliente;
import com.pinhobrunodev.orderservice.model.dto.ClienteDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

    Optional<Cliente> findByNomeAndTelefone(String nome, String telefone);

    Optional<Cliente> findByTelefone(String telefone);

    @Query("SELECT cliente FROM Cliente cliente WHERE cliente.nome = :nome AND cliente.telefone = :telefone AND cliente.id <> :id")
    Optional<Cliente> findByClienteUpdate(String nome, String telefone, Long id);

    Optional<Cliente> findByNome(String name);
    
}
