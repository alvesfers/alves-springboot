package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcaiRepository extends MongoRepository<Acai, String> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}