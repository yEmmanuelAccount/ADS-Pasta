// 010. Escreva  um  programa  que  leia  o  valor  dos  dois  catetos  de  um  triângulo  retângulo  e calcule o valor da hipotenusa.

#include <stdio.h>
#include <math.h>

void main() {
    // declarando variáveis
    float cateto1, cateto2, hipotenusa;

    // pedindo dados
    printf("Informe os catetos: ");
        printf("\n > [Cateto 01]: ");
        scanf("%f", &cateto1);
        printf(" > [Cateto 02]: ");
        scanf("%f", &cateto2);
    
    // calculando
    hipotenusa = sqrt(
        pow(cateto1, 2) + pow(cateto2, 2) 
    );

    // informando resultados
    printf("\n > [Hipotenusa]: %.2f \n", hipotenusa);
}