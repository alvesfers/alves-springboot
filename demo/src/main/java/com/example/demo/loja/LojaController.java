package com.example.demo.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List<Loja> listarLojas() {
        return lojaService.listarLojas();
    }

    @GetMapping("/{id}")
    public Optional<Loja> buscarLojaPorId(@PathVariable String id) {
        return lojaService.buscarLojaPorId(id);
    }

    @PostMapping
    public Loja criarLoja(@RequestBody Loja loja) {
        return lojaService.criarLoja(loja);
    }

    @PutMapping("/{id}")
    public Loja atualizarLoja(@PathVariable String id, @RequestBody Loja lojaAtualizada) {
        return lojaService.atualizarLoja(id, lojaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void deletarLoja(@PathVariable String id) {
        lojaService.deletarLoja(id);
    }
}
