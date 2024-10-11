package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcaiRepository extends MongoRepository<Acai, String> {
    // Métodos personalizados podem ser adicionados aqui se necessário
}