// página 27

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

void main() {
    // alocando um vetor com 3 inteiros
    int tamanho = 3, i;
    int *v = (int*) malloc(3 * sizeof(int));

    if(v){
        v[0] = 10;
        v[1] = 20;
        v[2] = 30;

        for(i = 0; i < tamanho; i++){
            printf("%d ", v[i]);
        }
    }
}