package model;

// importando dependências
import exceptions.DataInvalidaException;
import java.time.LocalDate;

public class Pessoa {
    // atributos
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    // constructor
    public Pessoa(String cpf, String nome, LocalDate nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) throws DataInvalidaException {
        if(nascimento.isAfter(LocalDate.now()))
            throw new DataInvalidaException("A data não pode ser posterior a hoje");
        this.nascimento = nascimento;
    }

    // toString (to String)
    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}