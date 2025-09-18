package p3__poo._4_array.exemplo2.view;

import p3__poo._4_array.exemplo2.model.*;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("João", 2000);
        Aluno aluno1 = new Aluno(123, "Maria Clara");
        Aluno aluno2 = new Aluno(124, "José Wilson");
        Aluno aluno3 = new Aluno(125, "Emanuel Franklyn");
        Aluno aluno4 = new Aluno(126, "Emmanuel Florêncio");
        Aluno alunos[] = {aluno1, aluno2, aluno3, aluno4};

        Turma turma = new Turma(professor, alunos);

        System.out.println(turma);
    }
}
