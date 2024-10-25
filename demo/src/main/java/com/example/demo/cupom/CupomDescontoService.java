package com.example.demo.cupom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CupomDescontoService {

    @Autowired
    private CupomDescontoRepository cupomDescontoRepository;

    // Criar um novo cupom
    public CupomDesconto criarCupom(CupomDesconto cupom) {
        cupom.setIdCupom(UUID.randomUUID().toString());
        return cupomDescontoRepository.save(cupom);
    }

    // Buscar cupom por código
    public Optional<CupomDesconto> buscarPorCodigo(String codigo) {
        return cupomDescontoRepository.findByCodigoCupom(codigo);
    }

    // Deletar cupom pelo ID
    public void deletarCupom(String id) {
        cupomDescontoRepository.deleteById(id);
    }

    // Listar todos os cupons
    public Iterable<CupomDesconto> listarCupons() {
        return cupomDescontoRepository.findAll();
    }
}
