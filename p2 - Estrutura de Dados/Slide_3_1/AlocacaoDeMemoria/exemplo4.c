// página 25

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

void main() {
    // alocando um inteiro
    int *p = (int*) malloc(sizeof(int));
    if (p){
        *p = 3;
        printf("%d \n", *p);
        free(p);
    }
}