// importando dependências
import java.util.Scanner;

public class Questao04 {
    // FUNÇÃO Recursiva - Calcular fatorial
    public static int calcularFatorial (int numero) {
        // condição de parada
        if (numero == 0 || numero == 1) {
            return 1;
        }

        // calculando recursivamente
        return numero * calcularFatorial(numero - 1);
    }

    // FUNÇÃO - principal
    public static void main (String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // pedindo dados
        System.out.println("Informe o número que deseja calcular o fatorial: ");
        int numero = scanner.nextInt();

        // calculando
        int resultadoFatorial = calcularFatorial(numero);

        // exibindo resultado
        System.out.println("O fatorial de "+numero+" é "+resultadoFatorial+".");

        // fechando scanner
        scanner.close();
    }
}
