package exemplo_caixa.model;

public class Caixa <T> {
    // atributos
    private T objetos;

    public T getObjeto() {
        return objetos;
    }

    public void setObjetos (T objetos) {
        this.objetos = objetos;
    }
}
