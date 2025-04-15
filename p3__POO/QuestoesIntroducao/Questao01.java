// FUNÇÃO - principal
public class Questao01 {
    public static void main(String[] args) {
        // declarando variáveis
        int valorMultiplo = 7; // valor que os números a serem imprimidos tem que ser múltiplos
        int i;
        int contador = 0;

        // verificando números que são múltiplos do valor escolhido
        for (i = 0; i <= 1000; i++){
            if (i % valorMultiplo == 0) {
                System.out.println(i);
                contador++;
            }
        }

        // informando quantos números são múltiplos do número escolhido dentro do intervalo
        System.out.printf("Ao total, dentro do intervalo de 0 a 1000, existem %d múltiplos de %d.", contador, valorMultiplo);
    }
}
