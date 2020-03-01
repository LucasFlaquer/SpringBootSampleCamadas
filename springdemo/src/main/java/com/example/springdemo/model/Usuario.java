package com.example.springdemo.model;

/**
 * Usuario
 */
public class Usuario {


    private String login;
    private String nome;
    private String email;
    private String senha;
    private String dataCriacao;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 
    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Usuario [dataCriacao=" + dataCriacao + ", email=" + email + ", login=" + login + ", nome=" + nome
                + ", senha=" + senha + "]";
    }

    
}