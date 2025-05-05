package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    // atributos
    private float salario;

    // constructor
    public Funcionario(String cpf, String nome,
           LocalDate nascimento, float salario){
        super(cpf, nome, nascimento);
        this.salario = salario;
    }

    // getters e setters
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}