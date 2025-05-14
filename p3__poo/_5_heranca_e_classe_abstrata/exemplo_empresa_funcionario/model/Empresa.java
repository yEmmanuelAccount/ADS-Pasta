package exemplo_empresa_funcionario.model;

public class Empresa {

    private String cnpj;
    private String razaoSocial;
    private Funcionario[] funcionarios;

    public Empresa(String cnpj, String razaoSocial, Funcionario[] funcionarios) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = funcionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularPagamentos(){
        double total = 0;
        for(Funcionario f : funcionarios){
            total += f.calcularPagamento();
        }
        return total;
    }

}