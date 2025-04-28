package p3__poo._4_array.exemplo2.model;

public class Turma {
    // atributos
    private Professor professor;
    private Aluno[] alunos;

    // constructor
    public Turma(Professor professor, Aluno[] alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }
    
    // administração de atributos
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
