package com.example.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestao.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
