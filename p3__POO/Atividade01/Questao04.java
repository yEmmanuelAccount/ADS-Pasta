// importando dependências
import java.util.Scanner;

// FUNÇÃO - Principal
public class Questao04 {

    public static void Asteriscos (int quantidade) {
        // exibindo asteriscos
        for(int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // declarando VETOR e VARIÁVEIS
        int n = 5; // tamanho do vetor
        int[] vetor = new int[n];
        int numero;

        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int i;

        // pedindo e lendo dados do usuário
        for (i = 0; i < n; i++) {
            do {
                System.out.printf("Informe o %dº número (entre 1 e 30): ", i+1);
                numero = scanner.nextInt();

                // Conferindo se está realmente entre 1 e 30
                if (numero < 1 || numero > 30) {
                    System.out.println("Número inválido. Deve estar entre 1 e 30. Tente novamente.");
                }
            } while (numero < 1 || numero > 30);
            vetor[i] = numero;
        }

        // exibindo resultados
        System.out.println("\nGráfico de Barras:");
        for (i = 0; i < n + 1; i++) {
            Asteriscos(i);
        }

        // fechando scanner
        scanner.close();
    }
}