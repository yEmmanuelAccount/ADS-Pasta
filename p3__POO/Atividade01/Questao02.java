/**
 * 2. Peça um número ao usuário. Verifique e imprima:
   * "Múltiplo de 3", se for múltiplo de 3;
   * "Múltiplo de 5", se for múltiplo de 5;
   * "Múltiplo de ambos", se for múltiplo de 3 e 5;
   * "Não é múltiplo de 3 nem de 5", caso contrário.
 */

// importando dependências
import java.util.Scanner;

// variáveis globais
class Configuracao {
    public static int Numero1 = 3;
    public static int Numero2 = 5;
}

// função principal
public class Questao02 {
    public static void main(String[] args) {
        // criando objeto para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        float numero;
        int parametro1 = Configuracao.Numero1;
        int parametro2 = Configuracao.Numero2;

        // pedindo dados ao usuário
        System.out.print("Informe o número que deseja verificar: ");
        numero = scanner.nextFloat();

        // verificando e imprimindo resultado(s)
        if (numero % parametro1 == 0 && numero % parametro2 == 0) {
            System.out.printf("O número %.2f é múltiplo de %d e %d.\n", numero, parametro1, parametro2);
        }
        else if (numero % parametro1 == 0) {
            System.out.printf("O número %.2f é múltiplo de %d.\n", numero, parametro1);
        }
        else if (numero % parametro2 == 0) {
            System.out.printf("O número %.2f é múltiplo de %d.\n", numero, parametro2);
        }
        else if (numero % parametro1 != 0 && numero % parametro2 != 0) {
            System.out.printf("O número %.2f não é múltiplo de %d nem de %d.\n", numero, parametro1, parametro2);
        }

        // fechando o scanner
        scanner.close();
    }
}