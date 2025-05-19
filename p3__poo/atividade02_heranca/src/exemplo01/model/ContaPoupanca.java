package exemplo01.model;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numero, Cliente cliente, double taxaJuros) {
        super(numero, cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public void renderJuros() {
        saldo += saldo * taxaJuros;
    }
}
