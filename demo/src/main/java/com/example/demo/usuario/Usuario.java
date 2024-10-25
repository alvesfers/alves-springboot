package com.example.demo.usuario;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String idUsuario;

    @NotBlank(message = "Nome é obrigatório")
    private String nomeUsuario;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email deve ser válido")
    private String emailUsuario;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, message = "Senha deve ter pelo menos 6 caracteres")
    private String senhaUsuario;

    @NotNull(message = "Nível do usuário é obrigatório")
    private Integer nivelUsuario;

    @NotNull(message = "Status do usuário é obrigatório")
    private Integer usuarioAtivo; // 0 = inativo, 1 = ativo

    private String cpfUsuario; // Pode ser nulo
    private String enderecoUsuario; // Pode ser nulo
    private String cepUsuario; // Pode ser nulo

    private int taskUsuario = 0; // Valor padrão 0

    // Getters e Setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Integer getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(Integer nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public Integer getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(Integer usuarioAtivo) {
        this.usuarioAtivo = usuarioAtivo;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getCepUsuario() {
        return cepUsuario;
    }

    public void setCepUsuario(String cepUsuario) {
        this.cepUsuario = cepUsuario;
    }

    public int getTaskUsuario() {
        return taskUsuario;
    }

    public void setTaskUsuario(int taskUsuario) {
        this.taskUsuario = taskUsuario;
    }
}