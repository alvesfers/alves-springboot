package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acais")
public class AcaiController {

    @Autowired
    private AcaiService acaiService;

    @PostMapping
    public ResponseEntity<Acai> criarAcai(@RequestBody Acai acai) {
        try {
            Acai acaiCriado = acaiService.save(acai);
            return new ResponseEntity<>(acaiCriado, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // Opcional: para depuração
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); // Retorna 500 em caso de erro
        }
    }
}