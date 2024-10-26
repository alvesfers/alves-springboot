package com.example.demo.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public List<Loja> listarLojas() {
        return lojaRepository.findAll();
    }

    public Optional<Loja> buscarLojaPorId(String id) {
        return lojaRepository.findById(id);
    }

    public Loja criarLoja(Loja loja) {
        return lojaRepository.save(loja);
    }

    public Loja atualizarLoja(String id, Loja lojaAtualizada) {
        lojaAtualizada.setIdLoja(id);
        return lojaRepository.save(lojaAtualizada);
    }

    public void deletarLoja(String id) {
        lojaRepository.deleteById(id);
    }
}
