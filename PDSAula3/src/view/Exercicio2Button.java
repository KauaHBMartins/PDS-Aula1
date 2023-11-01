package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Calculos;
import model.CalculoDivisao;
import javax.swing.ButtonGroup;


public class Exercicio2Button extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiroNumero;
	private JTextField textSegundoNumero;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2Button frame = new Exercicio2Button();
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
	public Exercicio2Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primeiro número inteiro:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 23, 163, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo número inteiro:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 48, 163, 14);
		contentPane.add(lblNewLabel_1);
		
		textPrimeiroNumero = new JTextField();
		textPrimeiroNumero.setBounds(183, 20, 160, 20);
		contentPane.add(textPrimeiroNumero);
		textPrimeiroNumero.setColumns(10);
		
		textSegundoNumero = new JTextField();
		textSegundoNumero.setBounds(183, 45, 160, 20);
		contentPane.add(textSegundoNumero);
		textSegundoNumero.setColumns(10);
		
		JRadioButton rdbtnAdicaoButton = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicaoButton);
		rdbtnAdicaoButton.setBounds(10, 86, 109, 23);
		contentPane.add(rdbtnAdicaoButton);
		
		JRadioButton rdbtnSubtracaoButton = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracaoButton);
		rdbtnSubtracaoButton.setBounds(10, 116, 109, 23);
		contentPane.add(rdbtnSubtracaoButton);
		
		JRadioButton rdbtnMultiplicaçãoButton = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicaçãoButton);
		rdbtnMultiplicaçãoButton.setBounds(10, 142, 109, 23);
		contentPane.add(rdbtnMultiplicaçãoButton);
		
		JRadioButton rdbtnDivisãoButton = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisãoButton);
		rdbtnDivisãoButton.setBounds(10, 168, 109, 23);
		contentPane.add(rdbtnDivisãoButton);
		
		JLabel lblresultado = new JLabel("-");
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblresultado.setBounds(183, 212, 97, 23);
		contentPane.add(lblresultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PrimeiroNumeroT= textPrimeiroNumero.getText();
				String SegundoNumeroT = textSegundoNumero.getText();
				int PrimeiroNumeroINT = Integer.valueOf(PrimeiroNumeroT);
				int SegundoNumeroINT = Integer.valueOf(SegundoNumeroT);
				Calculos CalcAdicao = new Calculos();
				Calculos CalcSubtracao = new Calculos();
				Calculos CalcMultiplicao = new Calculos();
				CalculoDivisao CalcDivisao = new CalculoDivisao();
				
				Integer ResultadoAdicao = CalcAdicao.CalcAdição(PrimeiroNumeroINT, SegundoNumeroINT);
				Integer ResultadoSsubtracao = CalcSubtracao.CalcSubtracao(PrimeiroNumeroINT, SegundoNumeroINT);
				Integer ResultadoMultiplicao = CalcMultiplicao.CalcMultiplicacao(PrimeiroNumeroINT, SegundoNumeroINT);
				Float ResultadoDivisao = CalcDivisao.CalcDivisao(PrimeiroNumeroINT, SegundoNumeroINT);

				if(rdbtnAdicaoButton.isSelected()) {
					lblresultado.setText("Resultado:"+ ResultadoAdicao);
				}
				else if (rdbtnSubtracaoButton.isSelected()) {
					lblresultado.setText("Resultado:"+ ResultadoSsubtracao);
				}
				else if (rdbtnMultiplicaçãoButton.isSelected()) {
					lblresultado.setText("Resultado:"+ ResultadoMultiplicao);
				}
				else if(rdbtnDivisãoButton.isSelected()) {
					lblresultado.setText("Resultado:"+ ResultadoDivisao);
				}
			}			
		});
		btnCalcular.setBounds(76, 213, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}
}
