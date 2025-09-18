package exemplo_caixa.view;

// importando dependências
import exemplo_caixa.model.*;

public class App {
    public static void main(String[] args) {
        Caixa<String> caixaString = new Caixa<>();
        Caixa<Integer> caixaInteger = new Caixa<>();

        caixaString.setObjetos("Paulo");
        caixaInteger.setObjetos(10);
        System.out.println(caixaString.getObjeto());
    }
}
