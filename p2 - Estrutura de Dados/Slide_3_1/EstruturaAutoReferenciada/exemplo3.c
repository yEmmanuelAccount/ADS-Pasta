// página 22 do slide

#include <stdio.h>
#include <conio.h>
#include <string.h>

typedef struct pessoa pessoa; // estrutura1
    struct pessoa {
        char nome[100];
        int idade;
        pessoa *pai;
    } Pessoa;

void main() {
    pessoa joao, pedro; // criando estrutura1
    pessoa *p = &joao;

    // adicionando informações de João
    strcpy(joao.nome, "joao da silva");
    joao.idade = 20;

    // adicionando informações de Pedro
    strcpy(pedro.nome, "pedro da silva");
    pedro.idade = 45;

    // colocando Pedro como pai de João, fazendo ele ocupar o espaço de "pessoa.pai"
    joao.pai = &pedro;

    // imprimindo as informações do "pessoa.pai"
    printf("Informacoes do pai: \n");
        printf(" Nome: %s; \n Idade: %d \n", joao.pai->nome, joao.pai->idade); // pela estrutura
        printf(" Nome: %s; \n Idade: %d \n", p->pai->nome, p->pai->idade); // pelo ponteiro que aponta para a estrutura
        printf("\n");

    // extra: imprimindo as informações de "filho"
    printf("Informacoes do filho: \n");
        printf(" Nome: %s; \n Idade: %d \n", joao.nome, joao.idade);
}