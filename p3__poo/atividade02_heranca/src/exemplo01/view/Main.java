package exemplo01.view;

import exemplo01.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1) criando clientes
        PessoaFisica pf = new PessoaFisica(
                "123.456.789-00",
                "João Silva",
                LocalDate.of(1985, 3, 15),
                LocalDate.now()
        );

        PessoaJuridica pj = new PessoaJuridica(
                "12.345.678/0001-99",
                "Acme Corp",
                LocalDate.now()
        );

        // 2) criando contas (2 de cada tipo)
        ContaCorrente ccPf = new ContaCorrente(1001, pf, 500.0);
        ContaCorrente ccPj = new ContaCorrente(2001, pj, 1000.0);
        ContaPoupanca cpPf = new ContaPoupanca(3001, pf, 0.01);
        ContaPoupanca cpPj = new ContaPoupanca(4001, pj, 0.02);

        // 3) Operações nas contas correntes
        ccPf.depositar(250.0);
        System.out.println("CC PF - saldo após depósito: " + ccPf.getSaldo());
        ccPf.sacar(600.0);  // usa cheque especial
        System.out.println("CC PF - saldo após saque:  " + ccPf.getSaldo());
        ccPf.cobrarTaxa();  // taxa de PF = R$10
        System.out.println("CC PF - saldo após taxa:   " + ccPf.getSaldo());
        System.out.println();

        ccPj.depositar(2000.0);
        System.out.println("CC PJ - saldo após depósito: " + ccPj.getSaldo());
        ccPj.sacar(2500.0); // até limite de cheque especial
        System.out.println("CC PJ - saldo após saque:    " + ccPj.getSaldo());
        ccPj.cobrarTaxa();  // taxa de PJ = R$100
        System.out.println("CC PJ - saldo após taxa:     " + ccPj.getSaldo());
        System.out.println();

        // 4) Operações nas contas poupança
        cpPf.depositar(1000.0);
        System.out.println("CP PF - saldo inicial:       " + cpPf.getSaldo());
        cpPf.renderJuros();  // 1% de juros
        System.out.println("CP PF - saldo após juros:    " + cpPf.getSaldo());
        cpPf.sacar(500.0);
        System.out.println("CP PF - saldo após saque:    " + cpPf.getSaldo());
        System.out.println();

        cpPj.depositar(5000.0);
        System.out.println("CP PJ - saldo inicial:       " + cpPj.getSaldo());
        cpPj.renderJuros();  // 2% de juros
        System.out.println("CP PJ - saldo após juros:    " + cpPj.getSaldo());
        cpPj.sacar(1000.0);
        System.out.println("CP PJ - saldo após saque:    " + cpPj.getSaldo());
    }
}
