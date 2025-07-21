package aula.view;

import aula.dao.GenericDao;
import aula.model.Professor;
import model.Aluno;

import java.io.IOException;

public class Main {
    public  static void main(String[] atgs) {
        GenericDao<Aluno> alunoDao;

        try {
            alunoDao = new GenericDao<Aluno>("anulos.txt");
            alunoDao.salvar(new Aluno(852, "Joaquim", "ADS"));

            System.out.println(alunoDao.getAll());

        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        GenericDao<Professor> professorDao;

        try {
            professorDao = new GenericDao<Professor>("professores.txt");
            professorDao.salvar(new Professor("222.222.222-02", "Maria", "ADS"));

            System.out.println(professorDao.getAll());

        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
