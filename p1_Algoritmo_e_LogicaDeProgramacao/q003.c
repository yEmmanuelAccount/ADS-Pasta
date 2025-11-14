// 003. Escreva um programa que leia o valor do lado de um quadrado e calcule a sua área e o seu perímetro.

#include <stdio.h>

void main() {
    // declarando variáveis
    float lado, area, perimetro;

    // pedindo dados
    printf("Informe a area do quadrado: ");
    scanf("%f", &lado);

    // calculando
    area = lado * lado;
    perimetro = lado * 4;

    // informado resultados
    printf("\n Um quadrado com lado \"%.2f\", possui: \n > [Area]: %.2f \n > [Perimetro]: %.2f \n\n", lado, area, perimetro);
}