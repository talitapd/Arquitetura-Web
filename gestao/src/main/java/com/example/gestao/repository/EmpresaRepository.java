package com.example.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestao.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}

