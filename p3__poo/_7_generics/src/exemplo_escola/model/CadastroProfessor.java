package exemplo_escola.model;

// importing dependencies
import java.util.Arrays;

public class CadastroProfessor {

    private Professor[] professores;
    private int quantidade;

    public CadastroProfessor(){
        professores = new Professor[10];
        quantidade = 0;
    }

    public boolean adicionarProfessor(Professor professor){
        if(quantidade < professores.length){
            professores[quantidade++] = professor;
            return true;
        }
        return false;
    }

    public Professor[] getProfessores(){
        return Arrays.copyOfRange(professores, 0, quantidade);
    }

}