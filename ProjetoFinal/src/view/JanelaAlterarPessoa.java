package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Pessoa;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAlterarPessoa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Create the frame.
	 */
	public JanelaAlterarPessoa(Pessoa pessoaSelecionada, JanelaTabela estaJanela) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 644, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][grow][][][][][][][][][]", "[][][][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Alterar Pessoa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 6 0");
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		contentPane.add(lblNewLabel_1, "cell 2 2");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 4 2 11 1,growx");
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		contentPane.add(lblNewLabel_2, "cell 2 3");
		
		txtCPF = new JTextField();
		contentPane.add(txtCPF, "cell 4 3 11 1,growx");
		txtCPF.setColumns(10);
		String cpfString = String.valueOf(pessoaSelecionada.getCpf());
		txtCPF.setText(cpfString);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		contentPane.add(lblNewLabel_3, "cell 2 4");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 4 4 11 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_4, "cell 2 5");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1, "cell 4 5 11 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Nascimento:");
		contentPane.add(lblNewLabel_5, "cell 2 6");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "cell 4 6 11 1,growx");
		
		JLabel lblNewLabel_6 = new JLabel("Endereço:");
		contentPane.add(lblNewLabel_6, "cell 2 7");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "cell 4 7 11 1,growx");
		
		JLabel lblNewLabel_7 = new JLabel("Cidade:");
		contentPane.add(lblNewLabel_7, "cell 2 8");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "cell 4 8 11 1,growx");
		
		JLabel lblNewLabel_8 = new JLabel("CEP:");
		contentPane.add(lblNewLabel_8, "cell 2 9");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		contentPane.add(textField_5, "cell 4 9 11 1,growx");
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pessoaSelecionada.setNome(txtNome.getText());
				int cpfInt = Integer.parseInt(txtCPF.getText());
				
				pessoaSelecionada.setCpf(cpfInt);
				estaJanela.atualizarDados(pessoaSelecionada);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton, "cell 6 12");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNewButton_1, "cell 9 12");
	}
	

	

}
