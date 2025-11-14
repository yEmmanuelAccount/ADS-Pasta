// 007. Escreva um programa que leia o valor da base e da altura de um triângulo e calcule a  qa sua área.

// A = (B x Altura ) / 2

#include <stdio.h>

void main() {
    // declarando variáveis
    float base, altura, area;

    // pedindo dados
    printf("Forneça as informações a seguir: \n");
        printf(" > BASE do triângulo: ");
        scanf("%f", &base);
        printf(" > ALTURA do triângulo: ");
        scanf("%f", &altura);

    // calculando
    area = (base * altura) / 2;

    // informando resultados
    printf("\nUm triângulo com BASE = \"%.2f\" e ALTURA = \"%.2f\" tem ÁREA igual a %.2f \n", base, altura, area);
}