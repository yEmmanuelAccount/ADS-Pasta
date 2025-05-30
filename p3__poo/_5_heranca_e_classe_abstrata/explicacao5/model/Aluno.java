package explicacao5.model;
import java.time.LocalDate;
import p3__poo._5_heranca_e_classe_abstrata.explicacao5.model_5;

public class Aluno extends Pessoa {
    // atributos
    private int matricula;
    private String curso;

    // constructor
    public Aluno (String cpf, String nome, LocalDate dataNascimento, int matricula, String curso) {
        super(); // chamando atributos da SuperClasse
        this.matricula = matricula;
        this.curso = curso;
    }

    // getters e setters
    public int getMatricula() {
        return matricula;
    }

    public int setMatricula (int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String setCurso (String curso) {
        this.curso = curso;
    }
}
