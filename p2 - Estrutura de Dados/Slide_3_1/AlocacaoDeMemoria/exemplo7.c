// modificando o tamanho da região alocada
// página 26

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

void main() {
    int tamanhoInicial = 3;
    int i;
    int *v = (int*) malloc(tamanhoInicial * sizeof(int));

    if(v){
        // colocando valores nos espaços existante
        v[0] = 10;
        v[1] = 20;
        v[2] = 30;

        // imprimindo valores
        for(i = 0; i < tamanhoInicial; i++){
            printf("%d ", v[i]);
        }
        printf("\n");

        // adicionando 1 espaço a mais
        tamanhoInicial++;

        v = (int*) realloc(v, tamanhoInicial * sizeof(int));
        v[3] = 40;

        // imprimindo valores
        for(i = 0; i < tamanhoInicial; i++){
            printf("%d ", v[i]);
        }
        printf("\n");

        free(v);
    }
}