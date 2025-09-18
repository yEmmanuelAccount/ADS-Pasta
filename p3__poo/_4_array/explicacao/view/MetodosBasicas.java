import java.util.Arrays;

public class MetodosBasicas {
    public static void main(String[] args) {
        // copiando todo o array
        int array0[] = {1,1,1,1,1,1};
        int array1[] = {3,6,5,7,3,1,1,1,1,1,1,1,1,1,1,1,};
        int array2[] = Arrays.copyOf(array1, 5); // se for um array maior para um menor, o segundo "aumenta de tamanho"

        System.out.println(array2);

        // copiando parte de um array para outro
        int array3[] = Arrays.copyOfRange(array1, 1, 3);

        // verificando se um array é igual ao outro
        boolean verificacao1 = Arrays.equals(array1, array3);
        if (verificacao1 == true) System.out.println("Os arrays 1 e 3 são iguais.");
        if (verificacao1 == false) System.out.println("Os arrays 1 e 3 são diferentes.");

        // verificando qual array é maior
        int verificacao3 = Arrays.compare(array0, array1);
        System.out.println(verificacao3);

        // verificando se uma parte de um array é igual a outro pedaço de outro array
        boolean verificacao2 = Arrays.equals(array1, null);
        System.out.println(verificacao2);

        // preencher um array com valor específico
        Arrays.fill(array1, 1); // todo o array
        Arrays.fill(array1, 0, 9, 1); // parte do array

        // ordenando array
        String nomes[] = {"Will", "Maria Clara", "Emmanuel", "Emanuel"};
        Arrays.sort(nomes);
        System.out.println(Arrays.toString(nomes));

        // busca binária em arrays
        int busca = Arrays.binarySearch(array1, 3); // retorna o índice do que procura
        System.out.println(busca);

        busca = Arrays.binarySearch(array1, 8); // se não tiver o valor dentro do array, retorna um valor negativo com a posição que ele deveria estar


    }
}
