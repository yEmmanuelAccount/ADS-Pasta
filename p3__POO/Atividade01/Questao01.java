// 1. Escreva um programa que leia o nome de um aluno e suas três notas, sendo a terceira nota com peso 2. Calcule e exiba a média ponderada, com duas casas decimais. Depois, exiba se o aluno está "Aprovado" (média ≥ 7) ou "Reprovado".

// importando dependências
import java.util.Scanner;

// Função - calcular média ponderada
public class Questao01{
    public static void main(String[] args) {
        // objeto para ler dados fornecidos pelo usuário
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        String nome;
        float nota1, nota2, nota3, peso1;
        double mediaPonderada;

        // pedindo dados ao usuário
        System.out.print("Informe o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.print("Informe as três notas do aluno: ");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();

        System.out.print("Informe o peso da última nota: ");
        peso1 = scanner.nextFloat();

        // calculando Média Ponderada
        mediaPonderada = (nota1 + nota2 + (nota3 * peso1)) / (2 + peso1);

        // exibindo resultado da Média Ponderada
        System.out.printf("A média ponderada de %s é: %.2f\n", nome, mediaPonderada);

        // verificando se o aluno está aprovado ou reprovado
        if(mediaPonderada >= 7) {
            System.out.print("Está aprovado.\n");
        }
        if(mediaPonderada >7) {
            System.out.print("Está reprovado.\n");
        }

        // fechando scanner
        scanner.close();
    }
}