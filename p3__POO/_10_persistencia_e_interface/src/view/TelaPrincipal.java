package view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class TelaPrincipal extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField campoNome;
    private JComboBox comboCurso;
    private JFormattedTextField campoMatricula;

    public TelaPrincipal() {
        setContentPane(contentPane);
        setTitle("IFPB - Cajazeiras");
        setAlwaysOnTop(true);
        ImageIcon icon = new ImageIcon("src/imagens/hat_graduation.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setDefaultButton(buttonOK);

        buttonCancel.addActionListener(e -> System.exit(0));
        buttonOK.addActionListener(e ->{
            if (validarFormulario()){
                System.out.println("Cadastrar");
            }
        });
    }

    private boolean validarFormulario() {
        if(campoMatricula.getText().equals("            ")){
            JOptionPane.showMessageDialog(null,
                    "Digite sua matrícula",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(campoNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                    "Informe o seu nome",
                    "Mensagem de erro",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(campoNome.getText().indexOf(" ")==-1){
            JOptionPane.showMessageDialog(null,
                    "Digite nome e sobrenome",
                    "Mensagem de erro",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(comboCurso.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,
                    "Escolha um curso",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TelaPrincipal dialog = new TelaPrincipal();
        dialog.pack();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        try {
            MaskFormatter formatter = new MaskFormatter("############");
            campoMatricula = new JFormattedTextField(formatter);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}