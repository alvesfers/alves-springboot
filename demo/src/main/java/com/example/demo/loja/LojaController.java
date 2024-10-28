package com.example.demo.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    private final String GOOGLE_API_KEY = "AIzaSyBahUObidgNkGPbsGIbs62XPlPpULrWKBU"; // Substitua pela sua API Key

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

    // Novo método para calcular distância usando Google Distance Matrix API
    @GetMapping("/distancia")
    public ResponseEntity<String> calcularDistancia(
            @RequestParam String origem, 
            @RequestParam String destino) {
        String url = String.format(
            "https://maps.googleapis.com/maps/api/distancematrix/json?origins=%s&destinations=%s&key=%s",
            origem, destino, GOOGLE_API_KEY
        );

        RestTemplate restTemplate = new RestTemplate();
        try {
            String response = restTemplate.getForObject(url, String.class);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao calcular a distância.");
        }
    }
}