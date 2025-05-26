package exemplo_banco_brasil.model;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    // atributos
    private Queue<Ficha> fichas;

    public Fila() {
        fichas = new LinkedList<>();
    }

    public boolean adicionar(Ficha ficha) {
        return fichas.offer(ficha);
    }

    public Ficha inspecionar() {
        return fichas.peek();
    }

    public Ficha chamarProximo() {
        // TODO: verificar se a fila de fichas está vazia
        return fichas.poll();
    }
}
