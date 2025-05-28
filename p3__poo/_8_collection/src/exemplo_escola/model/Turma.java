package exemplo_escola.model;

import java.util.List;

public class Turma {

    // atributos
    private Professor professor;
    private List<Aluno> alunos;
    private String disciplina;

    //

    public Turma(Professor professor, List<Aluno> alunos, String disciplina) {
        this.professor = professor;
        this.alunos = alunos;
        this.disciplina = disciplina;
    }


    // getters e setters

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // toString

    @Override
    public String toString() {
        return "Turma{" +
                "professor=" + professor +
                ", alunos=" + alunos +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    public boolean adicionarAluno(Aluno aluno) {
        return Aluno.add(aluno);
    }
}
