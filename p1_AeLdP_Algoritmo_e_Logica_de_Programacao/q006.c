// 006. Escreva um programa que leia um número inteiro e informe o seu antecessor e o seu sucessor.

#include <stdio.h>

void main() {
    // declarando variáveis
    int numero, antecessor, sucessor;

    // pedindo dados
    printf("Informe o numero inteiro que deseja saber o antecessor e o sucessor: ");
    scanf("%d", &numero);

    // calculando
    antecessor = numero - 1;
    sucessor = numero + 1;
    
    // informando resultados
    printf("\nO número \"%d\" possui: \n > [Antecessor]: %d \n > [Sucessor]: %d \n\n", numero, antecessor, sucessor);
}