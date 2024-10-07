package com.example.gestao.controller;

import org.springframework.web.bind.annotation.*;
import com.example.gestao.model.PessoaFisica;
import com.example.gestao.model.PessoaJuridica;
import com.example.gestao.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    // Pessoa Física
    @GetMapping("/fisicas")
    public List<PessoaFisica> getAllPessoasFisicas() {
        return pessoaService.getAllPessoasFisicas();
    }

    @PostMapping("/fisicas")
    public PessoaFisica createPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return pessoaService.createPessoaFisica(pessoaFisica);
    }

    @GetMapping("/fisicas/{id}")
    public PessoaFisica getPessoaFisicaById(@PathVariable Long id) {
        return pessoaService.getPessoaFisicaById(id).orElse(null);
    }

    @DeleteMapping("/fisicas/{id}")
    public void deletePessoaFisica(@PathVariable Long id) {
        pessoaService.deletePessoaFisica(id);
    }

    // Pessoa Jurídica
    @GetMapping("/juridicas")
    public List<PessoaJuridica> getAllPessoasJuridicas() {
        return pessoaService.getAllPessoasJuridicas();
    }

    @PostMapping("/juridicas")
    public PessoaJuridica createPessoaJuridica(@RequestBody PessoaJuridica pessoaJuridica) {
        return pessoaService.createPessoaJuridica(pessoaJuridica);
    }

    @GetMapping("/juridicas/{id}")
    public PessoaJuridica getPessoaJuridicaById(@PathVariable Long id) {
        return pessoaService.getPessoaJuridicaById(id).orElse(null);
    }

    @DeleteMapping("/juridicas/{id}")
    public void deletePessoaJuridica(@PathVariable Long id) {
        pessoaService.deletePessoaJuridica(id);
    }
}

