package view;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import model.Pessoa;
import model.PessoaJTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("ProjetoJTable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 281, 439, 169);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);

		txtNome = new JTextField();
		txtNome.setBounds(15, 24, 221, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(15, 133, 46, 14);
		contentPane.add(lblNewLabel);

		txtCPF = new JTextField();
		txtCPF.setBounds(15, 148, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeCovert = txtNome.getText();
				String cpfCovert = txtCPF.getText();
				Integer telefoneCovert = Integer.parseInt(txtTelefone.getText());
				Integer idadeCovert = Integer.parseInt(txtIdade.getText());
				Float pesoCovert = Float.parseFloat(txtPeso.getText());
				Float alturaCovert = Float.parseFloat(txtAltura.getText());

				Pessoa p = new Pessoa();
				p.setNomePessoa(nomeCovert);
				p.setCpfPessoa(Integer.parseInt(cpfCovert));
				p.setTelefonePessoa(telefoneCovert);
				p.setIdadePessoa(idadeCovert);
				p.setPesoPessoa(pesoCovert);
				p.setAlturaPessoa(alturaCovert);

				listaPessoas.add(p);
				atualizarJTableModel();
				limparCampos();

			}
		});
		btnNewButton.setBounds(341, 45, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();

				int cpf = (int) table.getValueAt(linhaparaexc, 1);

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpfPessoa() == cpf) {
						listaPessoas.remove(pessoa);
					}
				}

				atualizarJTableModel();
			}
		});
		btnNewButton_1.setBounds(341, 107, 89, 23);
		contentPane.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();
				int cpf = (int) table.getValueAt(linhaparaexc, 1);
				
				String nome = txtNome.getText();
				Integer cpf1 = Integer.parseInt(txtCPF.getText());
				Integer telefone = Integer.parseInt(txtTelefone.getText());
				Integer idade = Integer.parseInt(txtIdade.getText());
				Float peso = Float.parseFloat(txtPeso.getText());
				Float altura = Float.parseFloat(txtAltura.getText());
				
				
				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpfPessoa() == cpf) {
						pessoa.setNomePessoa(nome);
						pessoa.setCpfPessoa(cpf1);
						pessoa.setTelefonePessoa(telefone);
						pessoa.setIdadePessoa(idade);
						pessoa.setPesoPessoa(peso);
						pessoa.setAlturaPessoa(altura);

						atualizarJTableModel();
						limparCampos();
						
					}
				}

				atualizarJTableModel();
			}
		});
		btnNewButton_2.setBounds(341, 172, 89, 23);
		contentPane.add(btnNewButton_2);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(15, 63, 141, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(15, 108, 46, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(15, 192, 62, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(15, 232, 62, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(15, 49, 62, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(15, 94, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setBounds(15, 212, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Altura");
		lblNewLabel_4.setBounds(15, 172, 46, 14);
		contentPane.add(lblNewLabel_4);
	}

	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}

	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}
