package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcaiService {

    @Autowired
    private AcaiRepository acaiRepository; // Repositório para interagir com o MongoDB

    public Acai save(Acai acai) {
        return acaiRepository.save(acai); // Salva o Açaí no banco de dados
    }
}