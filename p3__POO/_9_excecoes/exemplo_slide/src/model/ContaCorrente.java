package model;

import exceptions.*;

public class ContaCorrente {
    // atributos
    private String titular;
    private double saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar (double valor) {
        // condições de controle
        if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente.");
        if (valor > 5000) throw new LimiteExedidoException("Limite excedido");

        // operações
        saldo = saldo - valor;
        return true;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
