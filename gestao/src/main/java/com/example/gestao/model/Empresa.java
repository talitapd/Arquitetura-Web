
package com.example.gestao.model;


import lombok.Getter;
import lombok.Setter;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@Getter
@Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    @ManyToMany
    @JoinTable(
        name = "empresa_pessoa_fisica",
        joinColumns = @JoinColumn(name = "empresa_id"),
        inverseJoinColumns = @JoinColumn(name = "pessoa_fisica_id")
    )
    private List<PessoaFisica> pessoaFisicas;

    @OneToMany(mappedBy = "empresa")
    private List<PessoaJuridica> pessoaJuridicas;
}

