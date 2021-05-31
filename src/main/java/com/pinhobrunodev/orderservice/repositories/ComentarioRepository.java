package com.pinhobrunodev.orderservice.repositories;

import com.pinhobrunodev.orderservice.model.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ComentarioRepository extends JpaRepository<Comentario,Long>{
    
}
