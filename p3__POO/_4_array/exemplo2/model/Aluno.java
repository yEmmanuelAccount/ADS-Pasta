package p3__poo._4_array.exemplo2.model;

public class Aluno {
    // atributis
    private int matricula;
    private String nome;

    // constructor
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    // administração de atributos
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
