package com.pinhobrunodev.orderservice.controller;

import java.util.List;

import com.pinhobrunodev.orderservice.model.dto.OrdemServicoDTO;
import com.pinhobrunodev.orderservice.model.dto.OrdemServicoInsertDTO;
import com.pinhobrunodev.orderservice.services.OrdemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ordens")
public class OrdemServicoController {

    @Autowired
    private OrdemService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrdemServicoDTO> save(@RequestBody OrdemServicoInsertDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrdemServicoDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }



    @GetMapping(value = "/today", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrdemServicoDTO>> findfindByToday() {
        return ResponseEntity.ok(service.findByToday());
    }

}
