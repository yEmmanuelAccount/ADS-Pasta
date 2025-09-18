package exemplo01.model;

public abstract class Conta {
    private int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public Cliente getCliente() { return cliente; }

    public abstract boolean sacar(double valor);

    public boolean depositar(double valor) {
        if (valor <= 0) return false;
        this.saldo += valor;
        return true;
    }
}
