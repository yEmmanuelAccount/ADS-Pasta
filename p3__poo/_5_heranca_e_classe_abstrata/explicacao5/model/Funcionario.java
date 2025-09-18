package exemplo01.model;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{

    protected float salario;

    public Funcionario(String cpf, String nome,
                       LocalDate nascimento, float salario){
        super(cpf, nome, nascimento);
        this.salario = salario;
    }

    public abstract float getSalario();

    public void setSalario(float salario) {
        this.salario = salario;
    }
}