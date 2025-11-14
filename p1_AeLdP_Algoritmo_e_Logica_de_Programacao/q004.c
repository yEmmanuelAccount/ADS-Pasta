// 004. Escreva  um  programa  que leia o  número  inteiro  positivo  e  calcule  o  seu  dobro, o seu triplo, o seu quadrado, o seu cubo e a sua raiz quadrada.

#include <stdio.h>
#include <math.h> // biblioteca C com algumas fórmulas prontas

void main() {
    // declarando variáveis
    int numero, dobro, triplo, quadrado;
    float raizQuadrada;

    // pedindo dados
    printf("Informe um número inteiro positivo: ");
    scanf("%d", &numero);

    // calculando
    dobro = numero * 2;
    triplo = numero * 3;
    quadrado = numero * numero;
    raizQuadrada = sqrt(numero);

    // informando resultado
    printf("\n O numero \"%d\" possui: \n > [Dobro]: %d \n > [Triplo]: %d \n > [Quadrado]: %d \n [Raiz Quadrada]: %.2f \n", numero, dobro, triplo, quadrado, raizQuadrada);
}