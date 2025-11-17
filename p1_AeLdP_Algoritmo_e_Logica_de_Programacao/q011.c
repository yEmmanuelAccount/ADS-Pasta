// 011. Escreva  um  programa  que  leia  um  valor em  real,  a  cotação  atual  do  dólar  e  calcule  o valor informado pelo usuário em dólares.

#include <stdio.h>

void main() {
    // declarando variáveis
    float valorReal, cotacaoAtual, valorDolares;

    // pedidos dados
    printf("Informe os dados pedidos:");
        printf("\n > [Valor em Reais]: ");
        scanf("%f", &valorReal);
        printf("> [Cotação Atual do Dólar]: ");
        scanf("%f", &cotacaoAtual);
    
    // calculando
    valorDolares = valorReal / cotacaoAtual;

    // informando resultados
    printf("\n > Valor convertido [Real --> Dólar]: %.2f \n", valorDolares);
}