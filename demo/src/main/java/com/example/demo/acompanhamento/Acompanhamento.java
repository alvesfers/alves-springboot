package com.example.demo.acompanhamento;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "acompanhamentos")
public class Acompanhamento {

    @Id
    private String idAcompanhamento;
    private String nomeAcompanhamento;
    private double precoAcompanhamento;
    private int isAcompanhamentoAtivo; // 0 ou 1

    public Acompanhamento() {}

    public Acompanhamento(String nomeAcompanhamento, double precoAcompanhamento, int isAcompanhamentoAtivo) {
        this.nomeAcompanhamento = nomeAcompanhamento;
        this.precoAcompanhamento = precoAcompanhamento;
        this.isAcompanhamentoAtivo = isAcompanhamentoAtivo;
    }

    // Getters e Setters
    public String getIdAcompanhamento() {
        return idAcompanhamento;
    }

    public void setIdAcompanhamento(String idAcompanhamento) {
        this.idAcompanhamento = idAcompanhamento;
    }

    public String getNomeAcompanhamento() {
        return nomeAcompanhamento;
    }

    public void setNomeAcompanhamento(String nomeAcompanhamento) {
        this.nomeAcompanhamento = nomeAcompanhamento;
    }

    public double getPrecoAcompanhamento() {
        return precoAcompanhamento;
    }

    public void setPrecoAcompanhamento(double precoAcompanhamento) {
        this.precoAcompanhamento = precoAcompanhamento;
    }

    public int getIsAcompanhamentoAtivo() {
        return isAcompanhamentoAtivo;
    }

    public void setIsAcompanhamentoAtivo(int isAcompanhamentoAtivo) {
        this.isAcompanhamentoAtivo = isAcompanhamentoAtivo;
    }
}