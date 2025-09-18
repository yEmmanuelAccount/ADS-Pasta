package exemplo03.model;
import java.util.Comparator;

public class ComparadorPessoaNascimento implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNascimento().compareTo(p2.getNascimento());
    }
}
