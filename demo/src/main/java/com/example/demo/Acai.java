package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tb_acai")

public class Acai {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private Float preco;
    private Integer qtdComplemento;
    private Boolean isTrufado;

    public Acai(String nome, String descricao, Float preco, Integer qtdComplemento, Boolean isTrufado) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdComplemento = qtdComplemento;
        this.isTrufado = isTrufado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getQtdComplemento() {
        return qtdComplemento;
    }

    public void setQtdComplemento(Integer qtdComplemento) {
        this.qtdComplemento = qtdComplemento;
    }

    public Boolean getIsTrufado() {
        return isTrufado;
    }

    public void setIsTrufado(Boolean isTrufado) {
        this.isTrufado = isTrufado;
    }
}