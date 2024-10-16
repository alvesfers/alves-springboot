package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcaiService {

    @Autowired
    private AcaiRepository acaiRepository; 

    public Acai save(Acai acai) {
        return acaiRepository.save(acai);
    }
}