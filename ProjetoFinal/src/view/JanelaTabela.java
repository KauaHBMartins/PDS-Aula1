package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Pessoa;
import model.PessoaJTableModel;
public class JanelaTabela extends JFrame {
	
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTable table;
	public ArrayList<Pessoa> listaPessoas;
	public JanelaTabela(ArrayList<Pessoa> listaPessoas) {
	this.listaPessoas = listaPessoas;
	 }
	public void atualizarDados(ArrayList<Pessoa> pessoas) {
	    this.listaPessoas = pessoas;
	    atualizarJTableModel();
	}
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTabela frame = new JanelaTabela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaTabela(Pessoa pessoaSelecionada) {
		table = new JTable();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 28, 714, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF", "Email", "Telefone", "Nascimento", "Endere\u00E7o", "Cidade", "CEP"
			}
		));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (Pessoa pessoa : listaPessoas) {
            model.addRow(new Object[] {
                pessoa.getNome(), pessoa.getCpf(), pessoa.getEmail(), pessoa.getTelefone(),
                pessoa.getNascimento(), pessoa.getEndereco(), pessoa.getCidade(), pessoa.getCep()
            });
        }
		JButton btnNewButton = new JButton("Alterar");
		
		
		JanelaTabela estaJanela = this;
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JanelaAlterarPessoa janelaAlterar = new JanelaAlterarPessoa(pessoaSelecionada, estaJanela);
				janelaAlterar.setVisible(true);
			}
		});
		btnNewButton.setBounds(127, 400, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaSelecionada = table.getSelectedRow();
                Pessoa pessoaSelecionada = listaPessoas.get(linhaSelecionada);

                pessoaSelecionada.setNome(txtNome.getText());
                int cpfInt = Integer.parseInt(txtCPF.getText());
                pessoaSelecionada.setCpf(cpfInt);

                atualizarDadosPessoa(pessoaSelecionada);
                dispose();
			}
		});
		btnNewButton_1.setBounds(277, 400, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
					return;
				}
				
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
			}
		});
		btnExcluir.setBounds(407, 400, 89, 23);
		contentPane.add(btnExcluir);
	}

	public JanelaTabela() {
		// TODO Auto-generated constructor stub
	}

	private void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));
		
	}
	public void atualizarDadosPessoa(Pessoa pessoa) {
		int linhaSelecionada = table.getSelectedRow();
		listaPessoas.set(linhaSelecionada, pessoa);
		atualizarJTableModel();
	}
	
}
