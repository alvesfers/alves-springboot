package com.example.demo.acompanhamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acompanhamentos")
public class AcompanhamentoController {

    @Autowired
    private AcompanhamentoService acompanhamentoService;

    @GetMapping
    public List<Acompanhamento> getAllAcompanhamentos() {
        return acompanhamentoService.getAllAcompanhamentos();
    }

    @GetMapping("/{id}")
    public Optional<Acompanhamento> getAcompanhamentoById(@PathVariable String id) {
        return acompanhamentoService.getAcompanhamentoById(id);
    }

    @PostMapping
    public Acompanhamento createAcompanhamento(@RequestBody Acompanhamento acompanhamento) {
        return acompanhamentoService.saveAcompanhamento(acompanhamento);
    }

    @DeleteMapping("/{id}")
    public void deleteAcompanhamento(@PathVariable String id) {
        acompanhamentoService.deleteAcompanhamento(id);
    }
}