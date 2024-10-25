package com.example.demo.loja;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LojaRepository extends MongoRepository<Loja, String> {
}
