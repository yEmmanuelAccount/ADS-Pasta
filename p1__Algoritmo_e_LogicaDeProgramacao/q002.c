// 2. Escreva um programa que leia três números e seus respectivos pesos e calcule a sua média ponderada.

#include <stdio.h>
#include <conio.h>

int main () {
    // declarando variáveis
    int num1, num2, num3;
    int peso1, peso2, peso3;
    float media;

    // pedindo dados
    printf("Informe o numero1 e seu respectivo peso: ");
    scanf("%d%d", &num1, &peso1);

    printf("\nInforme o numero2 e seu respectivo peso: ");
    scanf("%d%d", &num2, &peso2);

    printf("\nInforme o numero3 e seu respectivo peso: ");
    scanf("%d%d", &num3, &peso3);

    // calculando
    media = (float)((num1 * peso1)+(num2 * peso2)+(num3 * peso3)) / (peso1 + peso2 + peso3);

    // informando resultado
    printf("A media dos dados informados eh %.2f", media);
    getch();

    return 0;
}