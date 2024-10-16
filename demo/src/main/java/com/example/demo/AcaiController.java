package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") 
@RequestMapping("/acais")  
public class AcaiController {

    @Autowired
    private AcaiRepository acaiRepository;

    @PostMapping
    public ResponseEntity<Acai> criarAcai(@RequestBody Acai novoAcai) {
        if (novoAcai.getNome() == null || 
            novoAcai.getDescricao() == null || 
            novoAcai.getPreco() == null || 
            novoAcai.getQtdComplemento() == null || 
            novoAcai.getTamanho() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    
        Acai acaiSalvo = acaiRepository.save(novoAcai);
        return ResponseEntity.status(HttpStatus.CREATED).body(acaiSalvo);
    }

    // Mapeamento para a rota raiz
    @GetMapping("/")
    public String home() {
        return "Bem-vindo à API de Açaís!";
    }
}
