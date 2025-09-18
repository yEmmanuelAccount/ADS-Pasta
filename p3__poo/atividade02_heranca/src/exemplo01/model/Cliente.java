package exemplo01.model;

import java.time.LocalDate;

public abstract class Cliente {
    private LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
}
