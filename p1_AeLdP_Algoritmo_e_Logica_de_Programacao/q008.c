// 008. Escreva um programa que leia o valor de uma temperatura em Celsius e calcule o seu valor correspondente em Fahrenheit e em Kelvin.

#include <stdio.h>

void main() {
    // declarando variáveis
    float celsius, fahrenheit, kelvin;

    // pedindo dados
    printf("Informe a temperatura em CELSIUS: ");
    scanf("%f", &celsius);

    // calculando
    fahrenheit = ((9 * celsius) / 5) + 32;
    kelvin = celsius + 273.15;

    // informando resultados
    printf("\n%.2f° C equivalem a: \n > %.2f° F \n > %.2f K \n", celsius, fahrenheit, kelvin);
}