package exemplo_empresa_funcionario.model;

public class Horista extends Funcionario{

    private double valorHora;
    private double totalHoras;

    public Horista(String cpf, String nome, double valorHora, double totalHoras) {
        super(cpf, nome);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public double calcularPagamento(){
        return valorHora * totalHoras;
    }

}