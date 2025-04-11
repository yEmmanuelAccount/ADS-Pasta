// 1. Escreva um programa que leia três números inteiros e calcule a sua média aritmética.

#include <stdio.h>
#include <conio.h>

void main() {
    // declarando variáveis
    int num1, num2, num3;
    float resultado;

    // lendo números
    printf("Escreva os 3 numeros inteiros para a media aritmetica: \n");
    scanf("%d%d%d", &num1, &num2, &num3);

    // calculando média aritmética
    resultado = (float)(num1 + num2 + num3) / 3;

    // informando resultado
    printf("A media aritmetica de %d, %d e %d eh %.2f", num1, num2, num3, resultado);
    getch();
}
