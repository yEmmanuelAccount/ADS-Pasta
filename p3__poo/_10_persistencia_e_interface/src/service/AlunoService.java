package service;

import dao.GenericDao;
import exceptions.AlunoExisteException;
import exceptions.MatriculaInvalidaException;
import exceptions.NomeInvalidoException;
import model.Aluno;

import java.io.IOException;
import java.util.Set;

public class AlunoService {

    private GenericDao<Aluno> alunoDao;

    public AlunoService() throws IOException {
        alunoDao = new GenericDao<>("alunos.txt");
    }

    public boolean salvar(Aluno aluno) throws IOException,
            ClassNotFoundException, AlunoExisteException,
            NomeInvalidoException, MatriculaInvalidaException {
        Set<Aluno> alunos = alunoDao.getAll();
        if(alunos.contains(aluno)){
            throw new AlunoExisteException(
                    "Já existe um aluno com essa matrícula");
        }
        if(aluno.getNome().indexOf(" ")==-1){
            throw new NomeInvalidoException(
                    "O nome precisa ser completo");
        }
        String matricula = ""+aluno.getMatricula();
        int ano = Integer.parseInt(matricula.substring(0, 4));
        int semestre = Integer.parseInt(matricula.substring(4,5));
        if(ano < 1994 || (semestre !=1 && semestre !=2) ){
            throw new MatriculaInvalidaException(
                    "A matrícula fornecida é inválida");
        }
        return alunoDao.salvar(aluno);
    }


}