package model;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    private int matricula;
    private String nome;
    private String curso;

    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "model.Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}