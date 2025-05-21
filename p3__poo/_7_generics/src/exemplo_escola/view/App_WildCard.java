package exemplo_escola.view;

import exemplo_escola.model.*;

import java.util.Arrays;
import java.util.Objects;

public class App_WildCard {
    public static void main(String[] args) {
//        Cadastro<? super Integer> cadastro;
//        cadastro = new Cadastro<Number>();

        Dao<Professor> professorDao;
        professorDao = new ProfessorDaoBanco();

    }

    public static <T extends Number> void teste(T obj){
    }

}