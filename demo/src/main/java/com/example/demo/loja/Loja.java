package com.example.demo.loja;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lojas")
public class Loja {

    @Id
    private String idLoja;
    private String nomeLoja;
    private String responsavelLoja;
    private String telefoneLoja;
    private String enderecoLoja;
    private String complementoLoja;
    private String cepLoja;
    private String chavePix;
    private double valorKM;  // Novo campo para valor por KM

    // Getters e Setters
    public String getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(String idLoja) {
        this.idLoja = idLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getResponsavelLoja() {
        return responsavelLoja;
    }

    public void setResponsavelLoja(String responsavelLoja) {
        this.responsavelLoja = responsavelLoja;
    }

    public String getTelefoneLoja() {
        return telefoneLoja;
    }

    public void setTelefoneLoja(String telefoneLoja) {
        this.telefoneLoja = telefoneLoja;
    }

    public String getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(String enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public String getComplementoLoja() {
        return complementoLoja;
    }

    public void setComplementoLoja(String complementoLoja) {
        this.complementoLoja = complementoLoja;
    }

    public String getCepLoja() {
        return cepLoja;
    }

    public void setCepLoja(String cepLoja) {
        this.cepLoja = cepLoja;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public double getValorKM() {
        return valorKM;
    }

    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }
}
