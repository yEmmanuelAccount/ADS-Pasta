package p3__poo._3introducao_Objeto_e_Classe.exemplo3.view;

import p3__poo._3introducao_Objeto_e_Classe.exemplo3.model.*;

public class Main {
    public static void main(String[] args) {
        // criando contas
        ContaCorrente conta1 = new ContaCorrente(1, "João");
        ContaCorrente conta2 = new ContaCorrente(2, "Maria");

        // operações
        conta1.depositar(1000);
        conta1.depositar(1000000);

        conta2.depositar(500);

        conta1.transferir(conta2, 200);

        // exibindo resultados
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}
