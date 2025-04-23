// importando dependências
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int numeroInteiro, centena, dezena, unidade, resultado;

        // pedindo dados
        System.out.print("Informe um número de 3 dígitos: ");
        numeroInteiro = scanner.nextInt();

        // calculando soma dos algarismos
        unidade = numeroInteiro % 10;
        dezena = ((numeroInteiro % 100) - unidade) / 10;
        centena = (numeroInteiro - (numeroInteiro % 100)) / 100;

        resultado = unidade + dezena + centena;

        // exibindo resultado ao usuário
        System.out.printf("A soma dos algarismos desse número (%d, %d e %d) é: %d", centena, dezena, unidade, resultado);

        // fechando scanner
        scanner.close();
    }    
}
