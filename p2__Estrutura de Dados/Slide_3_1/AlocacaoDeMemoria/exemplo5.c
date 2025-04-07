// página 26

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

// definindo a estrutura "Pessoa"
typedef struct pessoa {
    char nome[100];
    int idade;
} Pessoa;

void main() {
    // alocando uma estrutura
    Pessoa *p = (Pessoa*) malloc(sizeof(Pessoa));

    if(p){
        p->idade = 3;
        printf("%d \n", p->idade);
        free(p);
    }
}