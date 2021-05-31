package com.pinhobrunodev.orderservice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    @OneToMany(mappedBy = "cliente")
    List<OrdemServico>ordens = new ArrayList<OrdemServico>();

    public Cliente() {}

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public List<OrdemServico> getOrdens() {
        return ordens;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

}
