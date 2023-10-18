package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculadoraInvestimento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimento frame = new CalculadoraInvestimento();
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
	public CalculadoraInvestimento() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Depósito mensal R$:");
		lblNewLabel.setBounds(66, 7, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumMeses = new JLabel("Num. meses:");
		lblNumMeses.setBounds(78, 52, 106, 14);
		contentPane.add(lblNumMeses);
		
		JLabel lblJurosAoMes = new JLabel("Juros ao mês %:");
		lblJurosAoMes.setBounds(66, 97, 106, 14);
		contentPane.add(lblJurosAoMes);
		
		JLabel lblTotalInvestido = new JLabel("Total investido + juros R$:");
		lblTotalInvestido.setBounds(46, 146, 139, 14);
		contentPane.add(lblTotalInvestido);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(66, 171, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(46, 21, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 66, 139, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 115, 139, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
	}
}
