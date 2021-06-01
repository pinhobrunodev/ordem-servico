package com.pinhobrunodev.orderservice.repositories;

import java.time.Instant;
import java.util.Optional;

import com.pinhobrunodev.orderservice.model.OrdemServico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico,Long> {

    @Query("SELECT ordem FROM OrdemServico ordem WHERE ordem.data_abertura = :date")
    Optional<OrdemServico> findByToday(Instant date);
    
}
