// criando package
package p3__poo._3introducao_Objeto_e_Classe.exemplo1.view;

// importando dependências
import java.time.LocalDate; // biclioteca

import p3__poo._3introducao_Objeto_e_Classe.exemplo1.model.*;

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

        // criando professor
        Professor Walter = new Professor("Walter", "123-123-123-12", "Manhã", "83 9 1234-1234", 5000);
    }
}