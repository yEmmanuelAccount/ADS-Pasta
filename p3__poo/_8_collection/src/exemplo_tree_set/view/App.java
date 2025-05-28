package exemplo_tree_set.view;

import java.util.*;
import exemplo_tree_set.model.*;

public class App {

    public static void main(String[] args) {

        Set<Aluno> conjunto = new TreeSet<>();
        conjunto.add(new Aluno("111.111.111-01",
                "João", 2));
        conjunto.add(new Aluno("111.111.111-01",
                "João", 2));
        conjunto.add(new Aluno("222.222.222-02",
                "Maria", 1));
        conjunto.add(new Aluno("111.111.111-01",
                "Pedro", 3));
        System.out.println(conjunto);

    }

}
