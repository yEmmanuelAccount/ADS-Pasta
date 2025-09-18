package view;

import aula.dao.*;
import dao.GenericDao;
import model.Aluno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class TelaVisualizarAluno extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;
    private GenericDao<Aluno> alunoDao;

    public TelaVisualizarAluno() {
        setContentPane(contentPane);
        setModal(true);
        pack();
        getRootPane().setDefaultButton(buttonOK);
    }

    private void createUIComponents() {
        String titulos[] = {"Matrícula", "Nome", "Curso"};
        DefaultTableModel model = new DefaultTableModel(titulos, 0);
        table1 = new JTable(model);
        try {
            alunoDao = new GenericDao<>("alunos.txt");
            List<Aluno> alunos = alunoDao.getAll().stream()
                    .sorted(Comparator.comparing(Aluno::getMatricula))
                    .toList();
            for(Aluno aluno : alunos){
                model.addRow(new Object[]{aluno.getMatricula(),
                        aluno.getNome(), aluno.getCurso()});
            }
            table1.setModel(model);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Falha ao carregar alunos",
                    "Mensagem de erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}