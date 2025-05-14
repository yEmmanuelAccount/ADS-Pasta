package exemplo_empresa_funcionario.model;

public class Assalariado extends Funcionario {

    private double salario;

    public Assalariado(String cpf, String nome, double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento(){
        return salario;
    }

}