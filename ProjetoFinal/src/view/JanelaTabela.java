package view;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Pessoa;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaTabela extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Pessoa> listaPessoas;
    private JTable table;

    public JanelaTabela(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
        initialize(null, null);
        atualizarDados(listaPessoas);
    }

    private void initialize(Pessoa pessoaSelecionada, JanelaTabela estaJanela) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(5, 5, 774, 428);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                        "Nome", "CPF", "Email", "Telefone", "Nascimento","Gênero","Nacionalidade", "Endereço", "Cidade","Estado", "CEP",
                }
        ));

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(5, 433, 390, 23);
        btnExcluir.addActionListener(e -> {
            int idx_linha = table.getSelectedRow();
            if (idx_linha < 0) {
                JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
                return;
            }
            listaPessoas.remove(idx_linha);
            atualizarDados(listaPessoas);
        });
        contentPane.add(btnExcluir);
        
        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        btnFechar.setBounds(396, 433, 383, 23);
        contentPane.add(btnFechar);
    }

    public void atualizarDados(ArrayList<Pessoa> pessoas) {
        this.listaPessoas = pessoas;

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        for (Pessoa pessoa : listaPessoas) {
            model.addRow(new Object[]{
                    pessoa.getNome(), pessoa.getCpf(), pessoa.getEmail(), pessoa.getTelefone(),
                    pessoa.getNascimento(),pessoa.getGenero(),pessoa.getNacionalidade(), pessoa.getEndereco(), pessoa.getCidade(),pessoa.getEstado() ,pessoa.getCep()
            });
        }
    }
	}

