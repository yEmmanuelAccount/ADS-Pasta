import java.util.Scanner;

public class Divisao{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        float numero1 = scanner.nextFloat();
        System.out.print("Informe o segundo número: ");
        float numero2 = scanner.nextFloat();

        double resultado = numero1 / numero2;

        System.out.printf("O resultado da divisão é: %.2f \n", resultado);

        // fechando scanner
        scanner.close();
    }
}
