// 005. Escreva  um  programa  que  leia  o  valor  do  raio  de  uma  circunferência  e  calcule  a  sua área e o seu comprimento.

#include <stdio.h>

void main() {
    // declarando variáveis
    const float PI = 3.14;
    float raio, area, comprimento;

    // pedindo dados
    printf("Informe o raio da circunferencia: ");
    scanf("%f", &raio);

    // calculando
    area = PI * raio * raio;
    comprimento = 2 * PI * raio;

    // informando resultados
    printf("\nUma circunferencia com raio de \"%.2f\" possui: \n > [Area]: %.2f \n > [Comprimento]: %.2f \n", raio, area, comprimento);
}