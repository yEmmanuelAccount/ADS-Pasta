package exemplo_banco_brasil.model;

import java.time.LocalDateTime;
import java.util.*;
public class Ficha {
    // atributos
    private static int cotFicha;
    private final int numeroFicha;
    private String cliente;
    private final LocalDateTime dataHora;

    public Ficha(String cliente) {
        numeroFicha = ++cotFicha;
        this.cliente = cliente;
        dataHora = LocalDateTime.now();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
