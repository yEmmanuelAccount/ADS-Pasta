package aula01.dao;

import aula01.model.*;
import aula01.view.*;

import java.io.*;
import java.security.PublicKey;
import java.util.HashSet;
import java.util.Set;

public class AlunoDao {

    private File arquivo;

    // garantindo que Aruivo existe
    public AlunoDao() throws IOException {
        arquivo = new File("alunos.txt");

        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
    }

    public Set<Aluno> getAlunos() throws IOException, ClassNotFoundException {
        // verificando se há algo no arquivo. Se for, retorna HashSet
        if (arquivo.length() != 0) {

            try (ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo)
            )) {
                return (Set<Aluno>) in.readObject();
            }

        }
        return new HashSet<>();
    }

    public boolean salvar (Aluno aluno) throws IOException, ClassNotFoundException {
        Set<Aluno> alunos = getAlunos();

        // se adicionar um aluno
        if (alunos.add(aluno)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo)
            )) {
                out.writeObject(alunos);
            }
            return true;
        }
        // se não adicionar um aluno
        return false;
    }
}
