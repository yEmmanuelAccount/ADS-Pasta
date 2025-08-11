package dao;

import aula.model.*;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class GenericDao <T> {

    // criando arquivo
    private File file;

    public GenericDao (String caminhoArquivo) throws IOException {
        file = new File(caminhoArquivo);

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public Set<T> getAll() throws IOException, ClassNotFoundException {
        if (file.length() != 0) {
            try (ObjectInputStream in = new ObjectInputStream (
                    new FileInputStream(file)
            )) {
                return (Set<T>) in.readObject();
            }
        }
        return new HashSet<>();
    }

    public boolean salvar(T objeto) throws IOException,
            ClassNotFoundException {
        Set<T> objetos = getAll();
        if(objetos.add(objeto)){
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    private void atualizarArquivo(Set<T> objetos) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream (
                new FileOutputStream(file)
        )){
            out.writeObject(objetos);
        }
    }

    public boolean remover(T objeto) throws IOException, ClassNotFoundException {
            Set<T> objetos = getAll();
        if(objetos.remove(objeto)){
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    public boolean atualizar(T objeto) throws IOException, ClassNotFoundException {
        Set<T> objetos = getAll();
        if(objetos.remove(objeto) && objetos.add(objeto)) {
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

}
