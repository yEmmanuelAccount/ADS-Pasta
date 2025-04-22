[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/QgV2typW)

# Orientações

1. As questões práticas devem ser salvas em arquivos que indiquem o número da questão. Exemplo: Questao1.java. 
2. As questões teóricas devem ser respondidas no README.md do repositório.

# Questões

1. Escreva um programa que leia o nome de um aluno e suas três notas, sendo a terceira nota com peso 2. Calcule e exiba a média ponderada, com duas casas decimais. Depois, exiba se o aluno está "Aprovado" (média ≥ 7) ou "Reprovado".

    * ---> Esse é o arquivo para a [Questão 01](Questao01.java).

2. Peça um número ao usuário. Verifique e imprima:
* "Múltiplo de 3", se for múltiplo de 3;
* "Múltiplo de 5", se for múltiplo de 5;
* "Múltiplo de ambos", se for múltiplo de 3 e 5;
* "Não é múltiplo de 3 nem de 5", caso contrário.

   * ---> Esse é o arquivo para a [Questão 02](Questao02.java). 

3. Peça ao usuário um número inteiro positivo N. Em seguida, imprima todos os números primos entre 2 e N.

   * ---> Esse é o arquivo para a [Questão 03](Questao03.java).

4. Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler os cinco números.

   * ---> Esse é o arquivo para a [Questão 04](Questao04.java).

5. Explique como o Scanner é utilizado para entrada de dados em Java, e como o System.out.printf pode ser útil para formatação de saída. Dê exemplos de ambos com leitura de um double e exibição com 2 casas decimais.

#### Scanner
<p style="text-indent: 2em;">
Primeiro é importado o pacote **java.util.Scanner** para que seja possível sua utilização dentro do código. Depois, é criado um "**objeto**" Scanner de qualquer nome, que é usado para a leitura de valores em si. Esse objeto é colocado de forma a atribuir um valor a uma variável já declarada e criada previamente.
</p>

#### System.out.printf
<p style="text-indent: 2em;">
Esse comando usa o <b>printf</b>, um dos tipos de <em>print</em>, que permite a formatação dos dados de saída. Com sua utilização, é possível escolher como apresentar um dado em questão, como por exemplo, o número de casas decimais.
</p>

<p style="text-indent: 2em;">
Há 8 tipos primitivos de variáveis em Java, além de tipos de referência, e diferentes formas de representá-las formatadamente dentro do <em>printf</em>.
</p>

<div align="center">

| N | Tipo | Como exibir no _printf_ |
| :-: | :-: | :-: |
| 1 | byte | %d |
| 2 | short | %d |
| 3 | int | %d |
| 4 | long | %d |
| 5 | float | %f |
| 6 | double | %f |
| 7 | char | %c |
| 8 | boolean | %b |
| 9 | String | %s |

</div>

#### Exemplificação do Scanner e do System.out.printf
```(java)
import java.util.Scanner; // para importar o pacote Scanner

Scanner scanner = new Scanner(System.in); // criação do objeto "scanner"

double numeroDouble = scanner.nextDouble(); // lendo e atribuindo o valor a variável "numero"

System.out.printf("O valor da variável é: %.2f", numeroDouble); // exibe para o usuário o valor da variável "numeroDouble" especificamente com 2 casas decimais
```

6. O código abaixo contém erros de sintaxe e/ou lógica. Identifique os erros, explique cada um e reescreva o código corrigido:

```(java)
import java.util.Scanner;

public class Contador {
    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador)
        }
    }
}
```

| Nº | Erro | Descrição |
| :-: | :-: | :- |
| 1 | [] | _String_ não está acompanhado dos seus colchetes |
| 2 | ; | Na linha que está o _println_, falta um ponto e vírgula no final da linha |
| 3 | ++ | O valor da variável _contador_ nunca é atualizado, fazendo com que nunca chegue a condição de parada do _while_ (<= 5) e, consequentemente, o loop nunca pare. |
| 4 | Identação | O código não está corretamente identado, o que pode dificultar o entendimento geral |
