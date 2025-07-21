package aula.view;
import model.Aluno;

import javax.swing.*;
import java.io.IOException;

public class Interface {
    public static void main(String[] args) {
        ImageIcon iconJuice = new ImageIcon("imagens/icon-aluno.png");

        String opcoes[] = {"Salvar", "Buscar", "Listar", "Atualizar", "Remover", "Sair"};

        // integrando com as classes Aluno e AlunoDao
        dao.AlunoDao alunoDao;
        try {
            alunoDao = new dao.AlunoDao();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ImageIcon icon = new ImageIcon("imagens/icon-aluno.png");
        while(true){
            String escolha = (String) JOptionPane.showInputDialog(null,
                    "Escolha a opção",
                    "CRUD Alunos",
                    JOptionPane.QUESTION_MESSAGE,
                    icon,
                    opcoes,
                    opcoes[0]
            );
            if(escolha == null) System.exit(0);
            switch (escolha){
                case "Salvar" ->{
                    int matricula = Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                                    "Informe a matrícula")
                    );
                    String nome = JOptionPane.showInputDialog(null,
                            "Informe o nome");
                    String curso = JOptionPane.showInputDialog(null,
                            "Informe o curso");

                    Aluno aluno = new Aluno(matricula, nome, curso);

                    try {
                        if(alunoDao.salvar(aluno)) {
                            JOptionPane.showMessageDialog(null,
                                    "Salvo com sucesso.");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,
                                    "Falha ao salvar. Já existe um aluno com essa matrícula.",
                                    "Mensagem de erro",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }

                case "Buscar" ->{
                    try{
                        int matricula = Integer.parseInt(
                                JOptionPane.showInputDialog(
                                        null,
                                        "Informe a matrícula"
                                ));
                        Aluno aluno = alunoDao.getAluno(matricula);
                        JOptionPane.showMessageDialog(null,
                                aluno);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }

                case "Listar" -> {
                    try {
                        JOptionPane.showMessageDialog(null,
                                alunoDao.getAlunos(),
                                "Listagem de alunos",
                                JOptionPane.PLAIN_MESSAGE,
                                icon);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }

                case "Sair" -> System.exit(0);
            }
        }


        // menu de navegação para Alunos
//        while (true) {
//            JOptionPane.showOptionDialog(
//                    null,
//                    "O que deseja fazer?",
//                    "CRUD Alunos",
//                    JOptionPane.OK_CANCEL_OPTION,
//                    JOptionPane.QUESTION_MESSAGE,
//                    iconJuice,
//                    opcoes,
//                    opcoes[0]
//            );
//        }

        // menu de confirmação
//        int retorno = JOptionPane.showConfirmDialog(
//                null,
//                "Opções",
//                "Escolha uma opção",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.QUESTION_MESSAGE,
//                iconJuice
//        );
//
//        switch (retorno) {
//            case JOptionPane.OK_OPTION -> System.out.println("O usuário escolheu *OK* na operação");
//            case JOptionPane.CANCEL_OPTION -> System.out.println("O usuário escolheu *CANCELAR a operação");
//            case JOptionPane.CLOSED_OPTION -> System.out.println("O usuário escolheu *FECHAR* a operação");
//        }

        // menu de seleção de opções
//        String valores[] = {"Opção 1", "Opção 2"};
//        String entrada = (String) JOptionPane.showInputDialog(
//                null,
//                "Mensagem",
//                "Entrada de Dados",
//                JOptionPane.QUESTION_MESSAGE,
//                iconJuice,
//                valores,
//                valores[0]
//        );
//        System.out.println(entrada);

        // hello world
//        JOptionPane.showMessageDialog(
//                null,
//                "Hello World",
//                "Mensagem do Sistema",
//                JOptionPane.ERROR_MESSAGE
//        );
    }
}
