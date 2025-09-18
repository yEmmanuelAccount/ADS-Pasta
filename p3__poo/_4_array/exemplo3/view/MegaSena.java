// Escreva um programa que leia os números de um jogo da mega sena. Os jogos podem ter de 6 a 10 números de 1 a 60. O programa deve ler os números e imprimir seu preço e os números escolhidos de forma ordenada. 6 numéros = 5 reais, 7 números = 35 reais, 8 números = 140 reais, 9 números = 420 reais e 10 números = 1050 reais.

// importando dependências
import java.util.Scanner;
import java.util.Arrays;

public class MegaSena {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int i, quantidadeNumeros;
        float valorParaPagar;

        // pedindo dados
        System.out.println("Informe a quantidade de números que deseja jogar: ");
        quantidadeNumeros = scanner.nextInt();

        // criando array
        int numerosMegaSena[] = new int[quantidadeNumeros];

        // ordenando os números escolhidos
        Arrays.sort(numerosMegaSena);

        // verificando quanto deve pagar
        valorParaPagar = switch (quantidadeNumeros) {
            case 6 -> 5;
            case 7 -> 35;
            case 8 -> 140;
            case 9 -> 420;
            case 10 -> 1050;
            default -> 0;
        };

        // informando
        System.out.println("Os números do jogo são: "+numerosMegaSena);

        System.out.printf("O valor a ser pago é: R$: %.2f", valorParaPagar);

    }
}
