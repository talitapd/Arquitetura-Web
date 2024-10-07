package com.example.gestao.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
@Getter
@Setter
public class PessoaFisica extends Usuario {
    private String cpf;
    private LocalDate dataNascimento;

    @ManyToMany(mappedBy = "pessoaFisicas")
    private List<Empresa> empresas;
}
