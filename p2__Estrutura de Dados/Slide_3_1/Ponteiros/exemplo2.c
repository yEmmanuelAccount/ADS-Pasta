// página 20 do slide

#include <stdio.h>
#include <conio.h>
#include <string.h>

typedef struct {
    char nome[100];
    int idade;
} Pessoa;

void main(){
    Pessoa joao;
    Pessoa *p = &joao;

    strcpy(joao.nome, "joao da silva");
    joao.idade = 20;
    printf("%s, %d \n", (*p).nome, (*p).idade);

    (*p).idade = 18;
    printf("%s, %d \n", joao.nome, joao.idade);
}

/*
    *p pode ser substituido por "->"
*/