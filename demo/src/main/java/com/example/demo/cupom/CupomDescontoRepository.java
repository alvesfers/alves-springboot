package com.example.demo.cupom;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface CupomDescontoRepository extends MongoRepository<CupomDesconto, String> {
    Optional<CupomDesconto> findByCodigoCupom(String codigoCupom);
}
