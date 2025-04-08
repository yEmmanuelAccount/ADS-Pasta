import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("A soma é: "+(numero1 + numero2));
    }
}
