package model_5;

import java.time.LocalDate;

public class Terceirizado extends Funcionario{

    private String firma;

    public Terceirizado(String cpf, String nome, LocalDate nascimento, float salario, String firma) {
        super(cpf, nome, nascimento, salario);
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public float getSalario(){
        return salario;
    }

}