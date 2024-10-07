package com.example.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestao.model.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}

