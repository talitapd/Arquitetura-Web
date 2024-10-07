package com.example.gestao.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario extends Pessoa {
    private String email;
    private String senha;
}