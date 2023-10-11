package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemp;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTemp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteATemperatura = new JLabel("Digite a temperatura:");
		lblDigiteATemperatura.setBounds(80, 64, 123, 14);
		contentPane.add(lblDigiteATemperatura);
		
		textTemp = new JTextField();
		textTemp.setColumns(10);
		textTemp.setBounds(213, 61, 162, 20);
		contentPane.add(textTemp);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempDigitada = textTemp.getText();
				float tempConvertidaF = Float.valueOf(tempDigitada);
				ConversaoTemp conv = new ConversaoTemp();
				float tempC = conv.converterFtoC(tempConvertidaF);
				
				JOptionPane.showMessageDialog(null, "Temperatura convertida : " + tempC);
			}
		});
		btnConverter.setBounds(55, 191, 89, 23);
		contentPane.add(btnConverter);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTemp.setText("");
			}
		});
		btnLimpar.setBounds(172, 191, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFecharBotao = new JButton("Fechar");
		btnFecharBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFecharBotao.setBounds(283, 191, 89, 23);
		contentPane.add(btnFecharBotao);
	}

}
