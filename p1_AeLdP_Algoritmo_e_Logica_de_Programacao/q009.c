// 009. Escreva  um  programa  que leia o valor  de  uma  distância  percorrida em  km  e  o  tempo gasto em horas e calcule a velocidade média em m / s.

#include <stdio.h>

void main() {
    // declarando variáveis
    float distanciaKM, tempoH, distanciaM, tempoS, velocidadeMedia_ms, velocidadeMedia_KmH;

    // pedindo dados
    printf("Informe o que é pedido: \n");
        printf(" > Distância percorrida (KM): ");
        scanf("%f", &distanciaKM);
    
        printf(" > Tempo gasto [H]: ");
        scanf("%f", &tempoH);
    
    // calculando
        // conversão
        distanciaM = distanciaKM * 1000;
        tempoS = tempoH * 60 * 60;

        // velocidade média
        velocidadeMedia_KmH = distanciaKM / tempoH;
        velocidadeMedia_ms = distanciaM / tempoS;
    
    // informando resultado
    printf("\nDados gerais: \n > [km]: %.2f (%.2f m) \n > [H]: %.2f (%.2f s) \n >> [Velocidade Média]: %.2f km/h (%.2f m/s)\n", distanciaKM, distanciaM, tempoH, tempoS, velocidadeMedia_KmH, velocidadeMedia_ms);
}