package exemplo_aluno_hashset.model;

import java.util.Objects;

public class Aluno {
    // atributos
    private String cpf;
    private String nome;
    private int matricula;

    // constructor
    public Aluno(String cpf, String nome, int matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
    }

    // getters e setters
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    // verifica se o Objeto já existe (acho)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(cpf, aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
