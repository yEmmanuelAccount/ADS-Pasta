package exemplo02.model;
import java.time.LocalDate;

public class Venda {
    // atributos (itens da venda)
    private LocalDate dataHora;
    private Pagamento pagamento;
    private double valor;

    public double getValorTotal() {
        return pagamento.processar(valor);
    }
}
