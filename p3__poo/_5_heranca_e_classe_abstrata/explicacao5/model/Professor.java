package exemplo01.model;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private Formacao formacao;

    public Professor(String cpf, String nome, LocalDate nascimento,
                     float salario, Formacao formacao) {
        super(cpf, nome, nascimento, salario);
        this.formacao = formacao;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    @Override
    public float getSalario(){
        //TODO: Atualizar para switch/case
        if(formacao == Formacao.Mestrado)
            return salario+1000;
        if(formacao == Formacao.Doutorado)
            return salario+2000;
        return salario;
    }

}