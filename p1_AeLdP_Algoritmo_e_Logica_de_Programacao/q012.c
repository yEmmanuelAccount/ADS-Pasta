// Escreva um programa que leia um valor em polegadas e o converta para centímetros, considerando que uma polegada equivale a 2.54 cm.

#include <stdio.h>

const float EQUIVALENCIA = 2.54;

void main() {
    // declarando variáveis
    float polegadas, centimetros;

    // pedindo dados
    printf("Informe o valor em polegadas: ");
    scanf("%f", &polegadas);

    // calculando
    centimetros = polegadas * EQUIVALENCIA;

    // informando resultados
    printf("\n > [%.2f em polegadas] equivalem a %.2f centímetros.\n\n", polegadas, centimetros);
}