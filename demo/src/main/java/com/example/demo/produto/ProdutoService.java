package com.example.demo.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto) {
        produto.setIdProduto(UUID.randomUUID().toString()); // Gera um ID único
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(String id) {
        return produtoRepository.findById(id);
    }

    public Produto atualizarProduto(String id, Produto produtoAtualizado) {
        produtoAtualizado.setIdProduto(id); // Mantém o ID existente
        return produtoRepository.save(produtoAtualizado);
    }

    public void deletarProduto(String id) {
        produtoRepository.deleteById(id);
    }
}