// 13. Escreva  um  programa  que  leia  um  valor  em  KB  e  calcule  o  seu  valor  correspondente em bits, bytes, MB e GB.

#include <stdio.h>

void main() {
    // declarando variáveis
    float valor_KB, valor_bits, valor_bytes, valor_MB, valor_GB;

    // pedindo dados
    printf("Informe o valor em KB para a conversão: ");
    scanf("%f", &valor_KB);

    // cálculos
        // KB para bytes -> 1 KB = 1024 bytes
        valor_bytes = valor_KB * 1024;

        // KB para bits -> 1 KB = 1024 bytes * 8 bits
        valor_bits = valor_KB * 1024 * 8;

        // KB para MB -> 1 MB -> 1024 KB
        valor_MB = valor_KB / 1024;

        // KB para GB -> 1 GB = 1024 MB = 1024 * 1024 KB
        valor_GB = valor_KB / (1024 * 1024);

    // informando resultados
    printf("\n> O valor de %.2f KB , convertido, fica: \n * [bytes]: %.2f \n * [bits]: %.2f \n * [MB]: %.2f \n * [GB]: %.2f \n\n", valor_KB, valor_bytes, valor_bits, valor_MB, valor_GB);
}