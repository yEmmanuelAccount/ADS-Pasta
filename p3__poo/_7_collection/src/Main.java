// importanado dependências
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Collection<String> e = new ArrayList<>();

        // ArrayList
            // CREAT e READ
            List<String> lista = new ArrayList<>(); // assincrona
            lista.add("João");
            lista.add("Maria");
            lista.add(1, "Pedro"); // abre uma nova posição para encaixar um novo elemento (entre João e Maria)
            System.out.println(lista);

            lista.remove("João"); // remove o elemento e desloca os outros para a nova posição após a remoção (movendo todos os elementos 1 posição a menos) (REMOVE)
            System.out.println(lista);

            // pegando a posição de um elemento específico
            System.out.println(lista.indexOf("Maria"));

            // vendo se um elemento pertence/está na lista
            System.out.println(lista.contains("João"));

            // vendo o tamanho da lista
            System.out.println(lista.size());

            // renomeando (UPDATE)
            lista.set(1, "Maria da Silva");
            System.out.println(lista);

            // pegando um elemento com base na posição
            System.out.println(lista.get(0));

            // podemos usar for
            for (String s : lista) {
                System.out.println(s);
            }

        // Vector
            Vector<String> lista2 = new Vector<>(); // sincrona
            lista2.add("João");
            lista2.add("Maria");
            lista2.add(1, "Pedro"); // abre uma nova posição para encaixar um novo elemento (entre João e Maria)
            System.out.println(lista2);

            lista2.remove("João"); // remove o elemento e desloca os outros para a nova posição após a remoção (movendo todos os elementos 1 posição a menos) (REMOVE)
            System.out.println(lista2);

            // pegando a posição de um elemento específico
            System.out.println(lista2.indexOf("Maria"));

            // vendo se um elemento pertence/está na lista2
            System.out.println(lista2.contains("João"));

            // vendo o tamanho da lista2
            System.out.println(lista2.size());

            // renomeando (UPDATE)
            lista2.set(1, "Maria da Silva");
            System.out.println(lista2);

            // pegando um elemento com base na posição
            System.out.println(lista2.get(0));

            // podemos usar for
            for (String s : lista2) {
                System.out.println(s);
            }

    }
}