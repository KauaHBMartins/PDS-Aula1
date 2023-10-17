package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.PrecoMarmita;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPeso = new JTextField();
		textPeso.setBounds(191, 27, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textPreco = new JTextField();
		textPreco.setBounds(191, 65, 86, 20);
		contentPane.add(textPreco);
		textPreco.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float Peso= Float.valueOf(textPeso.getText());
				float Preco= Float.valueOf(textPreco.getText());
				CalculoComida c= new CalculoComida();
				float PrecoFinal= c.Calculo(Preco, Peso);
				JOptionPane.showMessageDialog(null,"O preço final é de:" + PrecoFinal);
				
			}
		});
		btnCalcular.setBounds(181, 108, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblPeso = new JLabel("Informe o peso do prato: ");
		lblPeso.setBounds(10, 30, 193, 14);
		contentPane.add(lblPeso);
		
		JLabel lblValor = new JLabel("Informe o valor do kilo:");
		lblValor.setBounds(66, 68, 120, 14);
		contentPane.add(lblValor);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPreco.setText(null);
				textPeso.setText(null);
			}
		});
		btnLimpar.setBounds(131, 142, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(230, 142, 89, 23);
		contentPane.add(btnFechar);
	}
}
