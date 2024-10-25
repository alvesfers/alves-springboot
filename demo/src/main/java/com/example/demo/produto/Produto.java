package com.example.demo.produto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public class Produto {

    @Id
    private String idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private double precoProduto;
    private int tamanhoProduto;
    private Integer qtdComplemento;
    private int tipoProduto;  // Novo campo
    private int isAtivo; // 0 = inativo, 1 = ativo

    // Getters e Setters
    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getTamanhoProduto() {
        return tamanhoProduto;
    }

    public void setTamanhoProduto(int tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    public Integer getQtdComplemento() {
        return qtdComplemento;
    }

    public void setQtdComplemento(Integer qtdComplemento) {
        this.qtdComplemento = qtdComplemento;
    }

    public int getTipoProduto() {  // Getter para tipoProduto
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {  // Setter para tipoProduto
        this.tipoProduto = tipoProduto;
    }

    public int getIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(int isAtivo) {
        this.isAtivo = isAtivo;
    }
}