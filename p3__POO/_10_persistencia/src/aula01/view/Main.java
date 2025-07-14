// classe File

// importando dependências
package aula01.view;
import aula01.model.*;
import aula01.dao.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File arquivo = new File("teste.txt");

    /* LER INFORMAÇÕES SOBRE O ARQUIVO

        // conseguir informações do arquivo
        System.out.println("Tamanho : "+arquivo.length());
        System.out.println("Diretório : "+arquivo.getAbsolutePath());

        // escrever no arquivo
        try(BufferedWriter bw = new BufferedWriter(
                new FileWriter(arquivo, true)
        )) {
            bw.write("Hello World"); // escreve o conteúdo
            bw.newLine(); // pula linha
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    */

    /* SALVANDO INFORMAÇÕES NO ARQUIVO

        // criando aluno
        Aluno aluno = new Aluno(222, "Maria", "ADS"); // apenas essa parte seria trocada

        // salvando o aluno em um arquivo
        try(BufferedWriter bw = new BufferedWriter(
                new FileWriter(arquivo, true)
        )) {
            bw.write(aluno.getMatricula()+","+aluno.getNome()+","+aluno.getCurso()); // escreve o conteúdo
            bw.newLine(); // pula linha
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // lendo arquivo de "alunos"
        try(BufferedReader br = new BufferedReader(
                new FileReader(arquivo)
        )) {
            br.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    */

    /* SALVANDO NO ARQUIVO EM BINÁRIO

        // criando aluno
        Aluno aluno = new Aluno(111, "João", "ADS");

        // salvando o objeto Aluno no arquivo
        // serializando o Objeto
        try(ObjectOutputStream out = new ObjectOutputStream( // sempre sobescreve
                new FileOutputStream(arquivo)
        )){
            out.writeObject(aluno);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // lendo o arquivo em binário
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(arquivo)
        )){
            Aluno alunoLer = (Aluno) in.readObject();
            System.out.println(alunoLer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
     */

    /* TESTANDO O AlunoDao*/

        try {
            AlunoDao dao = new AlunoDao();
//            dao.salvar(new Aluno(111, "João", "ADS"));
            System.out.println(dao.getAlunos());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
