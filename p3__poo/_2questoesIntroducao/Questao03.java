// importando dependências
import java.util.Scanner;

public class Questao03 {
    // FUNÇÃO - Verificar se é um número perfeito
    public static boolean ehPerfeito(int numero) {
        // condição mínima de entrada
        if (numero <= 1) {
            return false;
        }

        // criando contador
        int divisores = 0;

        // calculando
        for (int i = 1; i <= (numero / 2); i++) {
            if (numero % i == 0) {
                divisores += i;
            }
        }
    return divisores == numero;
    }

    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // pedindo o dado ao usuário
        System.out.println("Informe o número inteiro que deseja verificar: ");
        int numero = scanner.nextInt();

        // verificando número
        if (ehPerfeito(numero)) {
            System.out.println("O número "+numero+" É SIM perfeito.");
        }
        else {
            System.out.println("O número "+numero+" NÃO É perfeito");
        }

        // fechando scanner
        scanner.close();
    }
}
