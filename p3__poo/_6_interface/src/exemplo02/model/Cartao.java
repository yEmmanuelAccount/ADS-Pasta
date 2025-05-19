package exemplo02.model;

public class Cartao implements Pagamento {
    @Override
    public double processar(double valor) {
        return valor * 1.01;
    }
}
