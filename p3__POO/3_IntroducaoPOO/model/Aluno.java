package model;

import java.time.LocalDate;

public class Aluno {
    // atributos ou propriedades
    private String nome;
    private int matricula;
    private String cpf;
    private String endereco;
    private String telefone;
    private LocalDate nascimento;

    // CONSTRUTORES
        // construtor model.Aluno - VAZIO
        public Aluno(){}

        // construtor model.Aluno - PARCIAL
        public Aluno(String nome, int matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }

        // construtor model.Aluno - COMPLETO
        public Aluno(String nome, int matricula, String cpf, String endereco, String telefone, LocalDate nascimento) {
            this.nome = nome;
            this.matricula = matricula;
            this.cpf = cpf;
            this.endereco = endereco;
            this.telefone = telefone;
            this.nascimento = nascimento;
        }

    // GETs
        public String getNome() {
            return nome;
        }

        public int getMatricula() {
            return matricula;
        }

        public String getCpf() {
            return cpf;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public LocalDate getNascimento() {
            return nascimento;
        }

    // SETs
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void setNascimento(LocalDate nascimento) {
            this.nascimento = nascimento;
        }
}