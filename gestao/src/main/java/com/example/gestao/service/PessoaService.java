package com.example.gestao.service;

import org.springframework.stereotype.Service;
import com.example.gestao.model.PessoaFisica;
import com.example.gestao.model.PessoaJuridica;
import com.example.gestao.repository.PessoaFisicaRepository;
import com.example.gestao.repository.PessoaJuridicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    private final PessoaFisicaRepository pessoaFisicaRepository;
    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    public PessoaService(PessoaFisicaRepository pessoaFisicaRepository, PessoaJuridicaRepository pessoaJuridicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
        this.pessoaJuridicaRepository = pessoaJuridicaRepository;
    }

    // Pessoa Física
    public List<PessoaFisica> getAllPessoasFisicas() {
        return pessoaFisicaRepository.findAll();
    }

    public PessoaFisica createPessoaFisica(PessoaFisica pessoaFisica) {
        return pessoaFisicaRepository.save(pessoaFisica);
    }

    public Optional<PessoaFisica> getPessoaFisicaById(Long id) {
        return pessoaFisicaRepository.findById(id);
    }

    public void deletePessoaFisica(Long id) {
        pessoaFisicaRepository.deleteById(id);
    }

    // Pessoa Jurídica
    public List<PessoaJuridica> getAllPessoasJuridicas() {
        return pessoaJuridicaRepository.findAll();
    }

    public PessoaJuridica createPessoaJuridica(PessoaJuridica pessoaJuridica) {
        return pessoaJuridicaRepository.save(pessoaJuridica);
    }

    public Optional<PessoaJuridica> getPessoaJuridicaById(Long id) {
        return pessoaJuridicaRepository.findById(id);
    }

    public void deletePessoaJuridica(Long id) {
        pessoaJuridicaRepository.deleteById(id);
    }
}

