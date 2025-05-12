package p3__POO.atividade2_Heranca.src.model;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public PessoaFisica(String cpf, String nome, LocalDate nascimento, LocalDate dataCadastro) {
        super(dataCadastro);
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

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
