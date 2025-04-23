// importando dependências
import java.util.Scanner;

// FUNÇÃO - Principal
public class Questao06 {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int i;
        String senha = "123456";
        String tentativa;

        // pedindo dados
        for (i = 3; i >= 0; i--) {
            if (i <= 0 ) {
                System.out.print("Número de tentativas excedido. Tente novamente mais tarde.");
                break;
            }

            System.out.printf("Informe a sua senha a seguir. Você tem %d tentativas:  ", i);
            tentativa = scanner.nextLine();

            if (tentativa.equals(senha)) {
                System.out.print("Pronto. Agora você está logado.");
                break;
            }
        }

        // fechando scanner
        scanner.close();
    }
}