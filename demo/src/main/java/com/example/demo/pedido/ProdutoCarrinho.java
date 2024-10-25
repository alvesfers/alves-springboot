package com.example.demo.pedido;

import java.util.List;

public class ProdutoCarrinho {
    private String nomeProduto;
    private int quantidade;
    private double precoProduto;
    private List<String> adicionaisNormais;
    private List<String> adicionaisPagos;
    private double custoAdicionaisPagos;

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public List<String> getAdicionaisNormais() {
        return adicionaisNormais;
    }

    public void setAdicionaisNormais(List<String> adicionaisNormais) {
        this.adicionaisNormais = adicionaisNormais;
    }

    public List<String> getAdicionaisPagos() {
        return adicionaisPagos;
    }

    public void setAdicionaisPagos(List<String> adicionaisPagos) {
        this.adicionaisPagos = adicionaisPagos;
    }

    public double getCustoAdicionaisPagos() {
        return custoAdicionaisPagos;
    }

    public void setCustoAdicionaisPagos(double custoAdicionaisPagos) {
        this.custoAdicionaisPagos = custoAdicionaisPagos;
    }
}
