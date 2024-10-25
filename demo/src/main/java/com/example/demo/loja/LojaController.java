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

    // Criar uma nova loja
    @PostMapping
    public Loja criarLoja(@RequestBody Loja loja) {
        return lojaService.criarLoja(loja);
    }

    // Listar todas as lojas
    @GetMapping
    public List<Loja> listarLojas() {
        return lojaService.listarLojas();
    }

    // Buscar uma loja por ID
    @GetMapping("/{id}")
    public Optional<Loja> buscarLojaPorId(@PathVariable String id) {
        return lojaService.buscarPorId(id);
    }

    // Atualizar uma loja por ID
    @PutMapping("/{id}")
    public Loja atualizarLoja(@PathVariable String id, @RequestBody Loja lojaAtualizada) {
        return lojaService.atualizarLoja(id, lojaAtualizada);
    }

    // Deletar uma loja por ID
    @DeleteMapping("/{id}")
    public void deletarLoja(@PathVariable String id) {
        lojaService.deletarLoja(id);
    }
}
