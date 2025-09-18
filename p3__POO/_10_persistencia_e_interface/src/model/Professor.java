package model;

import java.io.Serializable;
import java.util.Objects;

public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cpf;
    private String nome;
    String formacao;

    public Professor(String cpf, String nome, String formacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.formacao = formacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        return Objects.equals(getCpf(), professor.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
