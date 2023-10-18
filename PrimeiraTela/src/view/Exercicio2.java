package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPrimeiroNome;
	private JTextField textPnome;
	private JTextField textSobre;
	private JButton btnLimpar;
	private JButton btnFecharBotao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPrimeiroNome = new JLabel("Nome:");
		lblPrimeiroNome.setBounds(63, 51, 46, 14);
		contentPane.add(lblPrimeiroNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(63, 93, 61, 14);
		contentPane.add(lblSobrenome);
		
		textPnome = new JTextField();
		textPnome.setBounds(106, 48, 86, 20);
		contentPane.add(textPnome);
		textPnome.setColumns(10);
		
		textSobre = new JTextField();
		textSobre.setBounds(129, 90, 86, 20);
		contentPane.add(textSobre);
		textSobre.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomep = textPnome.getText();
				String nomes = textSobre.getText();
				JOptionPane.showMessageDialog(null, "O nome completo é : " + nomep + " " + nomes);
			}
		});
		btnNewButton.setBounds(162, 169, 89, 23);
		contentPane.add(btnNewButton);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPnome.setText("");
				textSobre.setText("");
			}
		});
		btnLimpar.setBounds(49, 169, 89, 23);
		contentPane.add(btnLimpar);
		
		btnFecharBotao = new JButton("Fechar");
		btnFecharBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFecharBotao.setBounds(282, 169, 89, 23);
		contentPane.add(btnFecharBotao);
	}

}
