package com.example.demo.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    // Criar uma nova loja
    public Loja criarLoja(Loja loja) {
        loja.setIdLoja(UUID.randomUUID().toString()); // Gera um ID único
        return lojaRepository.save(loja);
    }

    // Listar todas as lojas
    public List<Loja> listarLojas() {
        return lojaRepository.findAll();
    }

    // Buscar uma loja por ID
    public Optional<Loja> buscarPorId(String id) {
        return lojaRepository.findById(id);
    }

    // Atualizar uma loja existente
    public Loja atualizarLoja(String id, Loja lojaAtualizada) {
        lojaAtualizada.setIdLoja(id); // Mantém o ID existente
        return lojaRepository.save(lojaAtualizada);
    }

    // Deletar uma loja por ID
    public void deletarLoja(String id) {
        lojaRepository.deleteById(id);
    }
}
