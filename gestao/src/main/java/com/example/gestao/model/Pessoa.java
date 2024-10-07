package com.example.gestao.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class Pessoa {
    private Long id;
    private String nome;
    private String endereco;
}