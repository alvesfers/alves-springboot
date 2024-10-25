package com.example.demo.cupom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cupons")
public class CupomDescontoController {

    @Autowired
    private CupomDescontoService cupomDescontoService;

    // Criar um novo cupom
    @PostMapping
    public CupomDesconto criarCupom(@RequestBody CupomDesconto cupom) {
        return cupomDescontoService.criarCupom(cupom);
    }

    // Buscar cupom por código
    @GetMapping("/{codigo}")
    public Optional<CupomDesconto> buscarCupom(@PathVariable String codigo) {
        return cupomDescontoService.buscarPorCodigo(codigo);
    }

    // Listar todos os cupons
    @GetMapping
    public Iterable<CupomDesconto> listarCupons() {
        return cupomDescontoService.listarCupons();
    }

    // Deletar cupom pelo ID
    @DeleteMapping("/{id}")
    public void deletarCupom(@PathVariable String id) {
        cupomDescontoService.deletarCupom(id);
    }
}
