package exemplo03.view;

import exemplo03.model.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;

public class App {
    public static void main(String[] args) {
        Pessoa pessoas[] = {
                new Pessoa("João", LocalDate.of(2000, 10, 3)),
                new Pessoa("Maria", LocalDate.of(2001, 3, 21)),
                new Pessoa("Ana", LocalDate.of(1999, 4, 1))
        };

        // método de ordenação que conheciamos até agora
            // ordenando array
            Arrays.sort(pessoas);

            // imprimindo
            System.out.println(Arrays.toString(pessoas));

        // método novo (jeito difícil)
            // comparando
            ComparadorPessoaNascimento comparadorPessoaNascimento = new ComparadorPessoaNascimento();
            Arrays.sort(pessoas, comparadorPessoaNascimento);

            // imprimindo
            System.out.println(Arrays.toString(pessoas));

        // método novo (jeito fácil)
            // comparando
            OrdenadorNascimento ordenadorNascimento1 = new OrdenadorNascimento();
            Arrays.sort(pessoas, ordenadorNascimento1);

            // imprimindo
            System.out.println(Arrays.toString(pessoas));

        // método 3
            // comparando
            Comparator<Pessoa> ordenadorNascimento2 = new Comparator<Pessoa> () {
                @Override
                public int compare(Pessoa p1, Pessoa p2) {
                    return p1.getNascimento().compareTo(p2.getNascimento());
                }
            };

        // método 4
            // comparando
            Arrays.sort(pessoas,
                Comparator.comparing(Pessoa::getNascimento)
            );

            // imprimindo
            System.out.println(Arrays.toString(pessoas));
    }

    // implementando classe interna
    static class OrdenadorNascimento implements Comparator<Pessoa>, exemplo03.view.OrdenadorNascimento {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return p1.getNascimento().compareTo(p2.getNascimento());
        }
    }
}
