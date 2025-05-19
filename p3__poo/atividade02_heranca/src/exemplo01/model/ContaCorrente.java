package exemplo01.model;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, Cliente cliente, double chequeEspecial) {
        super(numero, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;
        double disponivel = saldo + chequeEspecial;
        if (valor > disponivel) return false;
        saldo -= valor;
        return true;
    }

    public void cobrarTaxa() {
        double taxa = (getCliente() instanceof PessoaJuridica) ? 100.0 : 10.0;
        if (saldo >= taxa) {
            saldo -= taxa;
        } else {
            chequeEspecial -= (taxa - saldo);
            saldo = 0;
        }
    }
}
