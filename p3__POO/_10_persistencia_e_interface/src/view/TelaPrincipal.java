package view;

import javax.swing.*;

//public class TelaPrincipal extends JDialog {
//    private JPanel contentPane;
//    private JButton buttonOK;
//    private JButton buttonCancel;
//
//    public TelaPrincipal() {
//        setContentPane(contentPane);
//        setModal(true);
//        getRootPane().setDefaultButton(buttonOK);
//    }
//
//    public static void main(String[] args) {
//        TelaPrincipal dialog = new TelaPrincipal();
//        dialog.pack();
//        dialog.setVisible(true);
//        System.exit(0);
//    }
//}

public class TelaPrincipal extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public TelaPrincipal() {
        setContentPane(contentPane);
        setTitle("IFPB - Cajazeiras");
        setAlwaysOnTop(true); // sempre vai ficar no "topo", na frente de qualquer janela
        ImageIcon icon = new ImageIcon("imagens/hat_graduation.png");
        setIconImage(icon.getImage());
        setBounds(50, 50, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        TelaPrincipal dialog = new TelaPrincipal();
        dialog.pack(); // sempre abre no tamanho mínimo
        dialog.setVisible(true);
    }
}
