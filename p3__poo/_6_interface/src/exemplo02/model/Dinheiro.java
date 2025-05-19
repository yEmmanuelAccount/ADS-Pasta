package exemplo02.model;

public class Dinheiro implements Pagamento {
    @Override
    public double processar(double valor) {
        return valor * 0.90;
    }
}
