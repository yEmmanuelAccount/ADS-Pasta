package view;// importando dependências
import model.Aluno;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // criando Alunos
        Aluno joao = new Aluno("João", 123, "111.111.111.11", "Rua X, 300", "08899999999", LocalDate.of(2000, 3, 25));

        Aluno maria = new Aluno();

        Aluno jose = new Aluno("José", 654);

        // alterando informações dos Alunos
        System.out.println(maria.getNome());
        maria.setNome("Maria de Oliveira");
        System.out.println(maria.getNome());

        System.out.println(joao.getNome());
        joao.setNome("João da Silva");
        System.out.println(joao.getNome());

        System.out.println(jose.getNome());
        jose.setNome("José Antônio");
        System.out.println(jose.getNome());

    }
}