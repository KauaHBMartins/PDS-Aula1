package view;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import model.comboBoxEstados;
import model.comboBoxGeneros;
import model.comboBoxNacionailades;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNomeCompleto;
	private JTextField textCPF;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textDataNascimento;
	private JTextField textEndereço;
	private JTextField textCidade;
	private JTextField textCEP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JanelaPrincipal() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[grow]"));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 0,grow");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(229, 236, 238));
		panel_1.setBorder(new TitledBorder(null, "Registrar-se", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		contentPane.add(panel_1, "cell 1 0,growy");
		panel_1.setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		panel_1.add(lblNewLabel, "cell 2 0");
		
		textNomeCompleto = new JTextField();
		panel_1.add(textNomeCompleto, "cell 2 1,growx");
		textNomeCompleto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		panel_1.add(lblNewLabel_1, "cell 2 2");
		
		textCPF = new JTextField();
		panel_1.add(textCPF, "cell 2 3,growx");
		textCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		panel_1.add(lblNewLabel_2, "cell 2 4");
		
		textEmail = new JTextField();
		panel_1.add(textEmail, "cell 2 5,growx");
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone");
		panel_1.add(lblNewLabel_3, "cell 2 6");
		
		textTelefone = new JTextField();
		panel_1.add(textTelefone, "cell 2 7,growx");
		textTelefone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento");
		panel_1.add(lblNewLabel_4, "cell 2 8");
		
		textDataNascimento = new JTextField();
		panel_1.add(textDataNascimento, "cell 2 9,growx");
		textDataNascimento.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gênero");
		panel_1.add(lblNewLabel_5, "cell 2 10");
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setModel(new DefaultComboBoxModel(comboBoxGeneros.values()));
		panel_1.add(comboBoxGenero, "cell 2 11,growx");
		
		JLabel lblNewLabel_6 = new JLabel("Nacionalidade");
		panel_1.add(lblNewLabel_6, "cell 2 12");
		
		JComboBox comboBoxNacionalidade = new JComboBox();
		comboBoxNacionalidade.setModel(new DefaultComboBoxModel(comboBoxNacionailades.values()));
		panel_1.add(comboBoxNacionalidade, "cell 2 13,growx");
		
		JLabel lblNewLabel_7 = new JLabel("Endereço");
		panel_1.add(lblNewLabel_7, "cell 2 14");
		
		textEndereço = new JTextField();
		panel_1.add(textEndereço, "cell 2 15,growx");
		textEndereço.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cidade");
		panel_1.add(lblNewLabel_8, "cell 2 16");
		
		textCidade = new JTextField();
		panel_1.add(textCidade, "cell 2 17,growx");
		textCidade.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Estado");
		panel_1.add(lblNewLabel_9, "cell 2 18");
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(comboBoxEstados.values()));
		panel_1.add(comboBoxEstado, "cell 2 19,growx");
	
		
		JLabel lblNewLabel_10 = new JLabel("CEP");
		panel_1.add(lblNewLabel_10, "cell 2 20");
		
		textCEP = new JTextField();
		panel_1.add(textCEP, "cell 2 21,growx");
		textCEP.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\ProjetoFinal\\src\\Imagens\\BotaoRegitrar.png"));
		panel_1.add(lblNewLabel_11, "flowx,cell 2 23");
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\ProjetoFinal\\src\\Imagens\\BotaoFechar.png"));
		panel_1.add(lblNewLabel_13, "cell 2 23");
	}

}
