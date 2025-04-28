// Escreva um programa que solicite uma quantidade de números do usuário e leia essa quantidade de números. Depois, informe os seguintes pontos: a soma dos números, o maior dos números e o menor dos números.

package p3__poo._4_array.exemplo1.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int quantidadeNumeros, i;
        int soma = 0, maior = 0, menor = 0;
        int posicaoMaior = 0, posicaoMenor = 0;

        // pedindo dados (quantidade de números)
        System.out.println("");
        System.out.print("Informe a quantidade de números que deseja adicionar: ");
        quantidadeNumeros = scanner.nextInt();
        System.out.println("");

        // criando um array vazio para o usuário adicionar os números
        int array[] = new int[quantidadeNumeros];

        // pedindos dados (quais os números)
        for (i = 0; i < quantidadeNumeros; i++) {
            System.out.printf("Informe o %d número: ", i+1);
            array[i] = scanner.nextInt();
        }

        // varificando os pontos pedidos
            // soma
            for (i = 0; i < quantidadeNumeros; i++) {
                soma = soma + array[i];
            }

            // maior
            for (i = 0; i < quantidadeNumeros; i++) {
                if (i == 0) {
                    maior = array[i];
                    posicaoMaior = i + 1;
                }
                if (array[i] > maior) {
                    maior = array[i];
                    posicaoMaior = i + 1;
                }
            }

            // menor
            for (i = 0; i < quantidadeNumeros; i++) {
                if (i == 0) {
                    menor = array[i];
                    posicaoMenor = i + 1;
                }
                if (array[i] < menor) {
                    menor = array[i];
                    posicaoMenor = i + 1;
                }
            }
        
        // imprimindo resultados
        System.out.printf("\n > A soma dos números é: %d\n > O maior número é %d (posição %d)\n > O menor número é o %d (posição %d)\n", soma, maior, posicaoMaior, menor, posicaoMenor);

        // fechando scanner
        scanner.close();
    }
}
