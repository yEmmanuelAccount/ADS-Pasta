// importanado dependências
import java.util.*;

public class Explicacao {
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
        
        // LinkedList 
            // exemplo de uso na pasta "exemplo_escola"

        // Stack
            // criando
            Stack<String> pilha = new Stack<>();

            // adicionando elementos
            pilha.push("João");
            pilha.add(0, "Não se usa isso");
            pilha.push("Maria");
            pilha.push("Pedro");
            pilha.push("José");
            
            // imprimindo a pilha
            while (!pilha.isEmpty()) {
                System.out.println(pilha.pop());
            }

            // saber quem está no topo mas sem remover
            System.out.println("Topo: "+ pilha.peek());

        // Queue
            // criando
            Queue<String> minhaFila = new LinkedList<>();

            // adicionando elementos
            minhaFila.offer("João");
            minhaFila.offer("Maria");
            minhaFila.offer("Pedro");
            minhaFila.offer("Ana");

            // saber quem é o primeiro da fila
            System.out.println("Primeiro elemento: "+ minhaFila.peek());

            // saber e remover o primeiro elemento
            System.out.println("Primeiro removendo: "+ minhaFila.poll());

            // resoculpando toda a lista
            while (!minhaFila.isEmpty()) {
                System.out.println(minhaFila.poll());
            }

    }
}