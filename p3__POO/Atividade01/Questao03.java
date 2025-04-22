// importando dependências
import java.util.Scanner;

public class Questao03 {
    // FUNÇÃO - verifica se um número é primo ou não
    public static boolean ehPrimo(int numero) {
        // declarando variáveis
        int contador1 = 0;
        int i;

        // verificando quantos divisores tem o número escolhido
        for (i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador1++;
            }
            if (contador1 > 2) {
                return false;
            }
        }
        return true;
    }

    // FUNÇÃO principal
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int numeroEscolhido, i;
        int contador2 = 0;

        // pedindo dados ao usuário
        System.out.print("Informe até que número deseja verificar: ");
        numeroEscolhido = scanner.nextInt();

        // calculando primos
        if (numeroEscolhido < 2) {
            System.out.printf("Não existem números primos entre 2 e %d", numeroEscolhido);
        }
        if (numeroEscolhido >= 2) {
            System.out.printf("Os números primos entre 2 e %d são: \n", numeroEscolhido);

            // passando pelos números entre 2 e o número escolhido
            for (i = 2; i <= numeroEscolhido; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i);
                    contador2++;
                }
            }
            System.out.printf("São %d números primos entre 2 e %d no total.", contador2, numeroEscolhido);
        }

        // fechando scanner
        scanner.close();
    }
}