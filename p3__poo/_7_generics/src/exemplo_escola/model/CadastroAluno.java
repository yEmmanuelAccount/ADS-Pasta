package exemplo_escola.model;

// dependency imports
import java.util.Arrays;

public class CadastroAluno {

    private Aluno[] alunos;
    private int quantidade;

    public CadastroAluno(){
        alunos = new Aluno[10];
        quantidade = 0;
    }

    public boolean adicionarAluno(Aluno aluno){
        if(quantidade < alunos.length){
            alunos[quantidade++] = aluno;
            return true;
        }
        return false;
    }

    public Aluno[] getAlunos(){
        return Arrays.copyOfRange(alunos, 0, quantidade);
    }


}

