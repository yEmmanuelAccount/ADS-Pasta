package view;

import model.Produto;
import model.GenericDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.Set;

public class TelaPrincipal_Supermercado extends JFrame {
    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private GenericDao<Produto> dao;

    public TelaPrincipal_Supermercado() {
        super("Gestão de Produtos");

        try {
            dao = new GenericDao<>("produtos.dat");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao acessar o arquivo: "
                            + e.getMessage());
            System.exit(1);
        }

        // Layout
        setLayout(new BorderLayout());

        // Tabela
        modeloTabela = new DefaultTableModel(
                new Object[]{"Código", "Descrição", "Preço"},
                0);
        tabela = new JTable(modeloTabela);
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        // Botões
        JPanel painelBotoes = new JPanel();
        JButton btnAdicionar = new JButton("Adicionar");
        JButton btnAtualizar = new JButton("Atualizar");
        JButton btnRemover = new JButton("Remover");

        painelBotoes.add(btnAdicionar);
        painelBotoes.add(btnAtualizar);
        painelBotoes.add(btnRemover);

        add(painelBotoes, BorderLayout.SOUTH);

        // Eventos
        btnAdicionar.addActionListener(e -> adicionarProduto());
        btnAtualizar.addActionListener(e -> carregarProdutos());
        btnRemover.addActionListener(e -> removerProduto());

        carregarProdutos();

        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void carregarProdutos() {
        try {
            modeloTabela.setRowCount(0);
            Set<Produto> produtos = dao.getAll();
            for (Produto p : produtos) {
                modeloTabela.addRow(new Object[]{p.getCodigo(), p.getDescricao(), p.getPreco()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao carregar produtos: "
                            + e.getMessage());
        }
    }

    private void adicionarProduto() {
        try {
            String codStr = JOptionPane.showInputDialog(null,
                    "Código:");
            if (codStr == null) return;
            int codigo = Integer.parseInt(codStr);

            String descricao = JOptionPane.showInputDialog(null,
                    "Descrição:");
            if (descricao == null) return;

            String precoStr = JOptionPane.showInputDialog(null,
                    "Preço:");
            if (precoStr == null) return;

            double preco = Double.parseDouble(precoStr);

            Produto p = new Produto(codigo, descricao, preco);
            if (dao.salvar(p)) {
                carregarProdutos();
                JOptionPane.showMessageDialog(null,
                        "Produto adicionado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Produto já existe.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao adicionar produto: "
                            + e.getMessage());
        }
    }

    private void removerProduto() {
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null,
                    "Selecione um produto para remover.");
            return;
        }

        int codigo = (int) modeloTabela.getValueAt(linhaSelecionada, 0);
        try {
            Produto p = new Produto(codigo, "", 0); // Apenas o código importa para equals
            if (dao.remover(p)) {
                carregarProdutos();
                JOptionPane.showMessageDialog(null,
                        "Produto removido com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Produto não encontrado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao remover produto: "
                            + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TelaPrincipal_Supermercado::new);
    }
}
