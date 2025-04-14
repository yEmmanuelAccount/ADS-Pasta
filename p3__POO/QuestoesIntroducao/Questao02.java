// importando dependências
import java.util.Scanner;

// FUNÇÃO - principal
public class Questao02 {
    // FUNÇÃO - Calcular Bhaskara
    public static void calcularBhaskara(double a, double b, double c) {

    }

    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        double numeroA, numeroB, numeroC, delta, raiz1, raiz2;

        // pedindo dados
        System.out.print("Informe os números equivalentes a A, B e C da equação do 2o grau: ");
        numeroA = scanner.nextDouble();
        scanner.nextLine();
        numeroB = scanner.nextDouble();
        scanner.nextLine();
        numeroC = scanner.nextDouble();
        scanner.nextLine();

        // calculando Delta
        delta = (numeroB * numeroB) - 4 * numeroA * numeroC;

        if (delta < 0) {
            System.out.print("Essa equação não possui raízes.");
        }
        if (delta == 0) {

            System.out.println("Essa equação possui 2 raízes iguais, que são: "+(-numeroB/(2 * numeroA)));
        }
        if (delta > 0) {
            // calculando raízes
            raiz1 = ((-numeroB + Math.sqrt(delta)) / (2 * numeroA));
            raiz2 = ((-numeroB - Math.sqrt(delta)) / (2 * numeroA));

            // exibindo raízes
            System.out.printf("As raízes para essa equação são %.2f e %.2f", raiz1, raiz2);
        }

        // fechando scanner
        scanner.close();

    }
}