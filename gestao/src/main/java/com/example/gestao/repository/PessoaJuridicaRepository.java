package com.example.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestao.model.PessoaJuridica;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}

