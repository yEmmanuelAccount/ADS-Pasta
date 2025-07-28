package model;

import java.io.*;
import java.util.*;

public class GenericDao<T> {
    private File file;

    public GenericDao(String arquivo) throws IOException {
        this.file = new File(arquivo);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public Set<T> getAll() throws IOException, ClassNotFoundException {
        if (file.length() != 0) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                return (Set<T>) in.readObject();
            }
        }
        return new HashSet<>();
    }

    private void atualizarArquivo(Set<T> objetos) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(objetos);
        }
    }

    public boolean salvar(T objeto) throws IOException, ClassNotFoundException {
        Set<T> objetos = getAll();
        if (objetos.add(objeto)) {
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    public boolean remover(T objeto) throws IOException, ClassNotFoundException {
        Set<T> objetos = getAll();
        if (objetos.remove(objeto)) {
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    public boolean atualizar(T objeto) throws IOException, ClassNotFoundException {
        Set<T> objetos = getAll();
        if (objetos.remove(objeto) && objetos.add(objeto)) {
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }
}
