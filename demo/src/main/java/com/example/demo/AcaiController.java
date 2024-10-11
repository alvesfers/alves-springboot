package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // Habilita CORS para o frontend
@RequestMapping("/acais")  // Define a base da URL para /acais
public class AcaiController {

    @Autowired
    private AcaiRepository acaiRepository;

    @PostMapping
    public ResponseEntity<Acai> criarAcai(@RequestBody Acai novoAcai) {
        // Verifica se algum campo obrigatório está ausente
        if (novoAcai.getNome() == null || 
            novoAcai.getDescricao() == null || 
            novoAcai.getPreco() == null || 
            novoAcai.getQtdComplemento() == null) {
            // Retorna BAD_REQUEST se algum campo obrigatório estiver ausente
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
        // Salva o novo açai no banco de dados
        Acai acaiSalvo = acaiRepository.save(novoAcai);
        
        // Retorna a resposta com status CREATED e o açai criado
        return ResponseEntity.status(HttpStatus.CREATED).body(acaiSalvo);
    }
}