package com.example.demo.acompanhamento;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcompanhamentoRepository extends MongoRepository<Acompanhamento, String> {
}