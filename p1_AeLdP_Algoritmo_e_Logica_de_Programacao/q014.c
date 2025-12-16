// 14. Escreva um programa que leia uma palavra e calcule o seu comprimento.

#include <stdio.h>
#include <string.h>

void main() {
    // declarando variáveis
    char palavraInformada[100];
    int numCaracteres;

    // pedindo dados
    printf("Informe uma palavra: ");
    scanf("%s", palavraInformada);

    // cálculo
    numCaracteres = strlen(palavraInformada);

    // informando resultado
    printf("\n> A palavra \"%s\" possui o comprimento de %d caracteres.\n\n", palavraInformada, numCaracteres);
}