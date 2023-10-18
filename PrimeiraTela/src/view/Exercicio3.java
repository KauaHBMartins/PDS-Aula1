package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNomebase;
	private JTextField textBase;
	private JTextField textAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNomebase = new JLabel("Base:");
		lblNomebase.setBounds(83, 53, 46, 14);
		contentPane.add(lblNomebase);
		
		JLabel lblNomeAltura = new JLabel("Altura:");
		lblNomeAltura.setBounds(83, 94, 46, 14);
		contentPane.add(lblNomeAltura);
		
		textBase = new JTextField();
		textBase.setBounds(126, 50, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setBounds(126, 91, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String baseDigitada = textBase.getText();
				String alturaDigitada = textAltura.getText();
				float basecdigitada = Float.valueOf(baseDigitada);
				float alturacdigitada = Float.valueOf(alturaDigitada);
				CalculoBaseAltura calc = new.calcularBA(CalculoBaseAltura);
			}
		});
		btnCalcular.setBounds(172, 188, 89, 23);
		contentPane.add(btnCalcular);
	}

}
