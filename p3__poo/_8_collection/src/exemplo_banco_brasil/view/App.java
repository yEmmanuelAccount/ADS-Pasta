package exemplo_banco_brasil.view;

import java.util.*;
import exemplo_banco_brasil.model.*;

public class App {
    public static void main(String[] args) {
        // criando scanner
        Scanner ler = new Scanner(System.in);

        // inicializando variáveis
        int escolha = 0;
        String nomeCliente = "";
        Fila fila = new Fila();

        // menu
        while (escolha != 4) {
            System.out.println("\n ============= MENU ============= \n" +
                                   "Escolha uma das opções a seguir \n" +
                                   "  > 1 - Criar Ficha \n" +
                                   "  > 2 - Ver próximo \n" +
                                   "  > 3 - Chamar próximo \n" +
                                   "  > 4 - Sair do Menu \n");
            escolha = ler.nextInt();
            ler.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.println("Informe o nome do cliente: ");
                    nomeCliente = ler.nextLine();
                    Ficha ficha = new Ficha(nomeCliente);
                    fila.adicionar(ficha);
                }
                case 2 -> System.out.println(fila.inspecionar());
                case 3 -> System.out.println(fila.chamarProximo());
                case 4 -> System.exit(0);
                default -> System.out.println("Opção Inválida.");
            }
        }
    }
}
