// Escreva um programa que leia as notas de X alunos. As notas devem ser guardadas no tipo double, de 0 a 10. Deve ser usado arrays e apresentar: as notas ordenadas, a maior nota, a menor nota e a média.

// importando dependências
import java.util.Scanner;
import java.util.Arrays;

public class NotasAlunos {
    public static void main(String[] args) {
        // declarando variáveis
        int numeroAlunos, i;
        double maiorNota, menorNota, media, somaNotas = 0;

        // criando Scanner
        Scanner scanner = new Scanner(System.in);

        // pedindo dados (quantidade de alunos)
        System.out.printf("\nInforme a quantidade de alunos que serão analisados: ");
        numeroAlunos = scanner.nextInt();

        // criando vetor para as notas
        double notas[] = new double[numeroAlunos];

        System.out.println();
        for (i = 0; i < numeroAlunos; i++) {
            System.out.printf("Informe a nota do %dº aluno: ", i + 1);
            notas[i] = scanner.nextDouble();
        }

        // ordenando as notas
        Arrays.sort(notas);

        // pegando a maior e menor nota
            // maior
            maiorNota = notas[numeroAlunos - 1];

            // menor
            menorNota = notas[0];
        
        // média de notas
        for (double nota: notas) somaNotas = nota + somaNotas;
        media = somaNotas / numeroAlunos;

        // exibindo resultados
        System.out.printf("\nEssas são as notas ordenadas:\n");
        System.out.println(Arrays.toString(notas));

        System.out.printf("\nMaior nota: %.2f \nMenor nota: %.2f\n", maiorNota, menorNota);

        System.out.printf("\nA média das notas é: %.2f\n", media);
    }
}
