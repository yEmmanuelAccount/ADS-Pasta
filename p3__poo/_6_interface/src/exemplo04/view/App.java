package exemplo04.view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import exemplo04.model.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produtos[] = {
                new Produto(1, "Arroz", 5.10),
                new Produto(3, "Feijão", 8.50),
                new Produto(4, "Açucar", 4.30),
                new Produto(5, "Macarrão", 3.45),
                new Produto(2, "Cuscuz", 2.50)
        };

        System.out.println("Supermercado X");
        while(true){
            System.out.println("Selecione a opção:" +
                    "\n 1 - Ordenar por ID" +
                    "\n 2 - Ordenar por Descricao" +
                    "\n 3 - Ordernar por Preço" +
                    "\n 4 - Sair");
            int escolha = scanner.nextInt();

            switch(escolha){
                case 1 -> Arrays.sort(produtos);
                case 2 -> Arrays.sort(produtos,
                        Comparator.comparing(Produto::getDescricao));
                case 3 -> Arrays.sort(produtos,
                        Comparator.comparing(Produto::getPreco));
                case 4 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
            System.out.println(Arrays.toString(produtos));

        }

    }

}