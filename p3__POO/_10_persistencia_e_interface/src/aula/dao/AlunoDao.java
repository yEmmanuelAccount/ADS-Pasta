//package dao;
//
//import model.Aluno;
//
//import java.io.*;
//import java.util.HashSet;
//import java.util.Set;
//
//public class AlunoDao {
//
//    private File arquivo;
//
//    public AlunoDao() throws IOException {
//        arquivo = new File("alunos.txt");
//        if(!arquivo.exists()){
//            arquivo.createNewFile();
//        }
//    }
//
//    public Set<Aluno> getAlunos() throws IOException,
//            ClassNotFoundException {
//        if(arquivo.length() != 0){
//            try(ObjectInputStream in = new ObjectInputStream(
//                    new FileInputStream(arquivo)
//            )){
//                return (Set<Aluno>) in.readObject();
//            }
//        }
//        return new HashSet<>();
//    }
//
//    public Aluno getAluno(int matricula) throws IOException,
//            ClassNotFoundException {
//        Set<Aluno> alunos = getAlunos();
//        for(Aluno aluno: alunos){
//            if(aluno.getMatricula() == matricula){
//                return aluno;
//            }
//        }
//        return null;
//    }
//
//    public boolean salvar(Aluno aluno) throws IOException,
//            ClassNotFoundException {
//        Set<Aluno> alunos = getAlunos();
//        if(alunos.add(aluno)){
//            atualizarArquivo(alunos);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean remover(Aluno aluno) throws IOException, ClassNotFoundException {
//        Set<Aluno> alunos = getAlunos();
//        if(alunos.remove(aluno)){
//            atualizarArquivo(alunos);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean atualizar(Aluno aluno) throws IOException,
//            ClassNotFoundException {
//        Set<Aluno> alunos = getAlunos();
//        if(alunos.remove(aluno) && alunos.add(aluno)){
//            atualizarArquivo(alunos);
//            return true;
//        }
//        return false;
//    }
//
//    private void atualizarArquivo(Set<Aluno> alunos) throws IOException {
//        try(ObjectOutputStream out = new ObjectOutputStream(
//                new FileOutputStream(arquivo)
//        )){
//            out.writeObject(alunos);
//        }
//    }
//
//
//}