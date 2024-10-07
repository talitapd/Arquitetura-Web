package com.example.gestao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class PessoaJuridica extends Usuario {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    @ManyToOne
    private Empresa empresa;
}
