package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.CalculoBaseAltura;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Exercicio1JButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1JButton frame = new Exercicio1JButton();
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
	public Exercicio1JButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBase.setText("");
				textAltura.setText("");
			}
		});
		btnLimpar.setBounds(40, 188, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFecharBotao = new JButton("Fechar");
		btnFecharBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFecharBotao.setBounds(298, 188, 89, 23);
		contentPane.add(btnFecharBotao);
		
		JLabel lblNomebase = new JLabel("Base:");
		lblNomebase.setBounds(83, 53, 46, 14);
		contentPane.add(lblNomebase);
		
		JRadioButton rdbtnRadioArea = new JRadioButton("Area");
		buttonGroup.add(rdbtnRadioArea);
		rdbtnRadioArea.setBounds(57, 133, 109, 23);
		contentPane.add(rdbtnRadioArea);
		
		JRadioButton rdbtnRadioPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnRadioPerimetro);
		rdbtnRadioPerimetro.setBounds(242, 133, 109, 23);
		contentPane.add(rdbtnRadioPerimetro);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(132, 163, 155, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CalculoBaseAltura c= new CalculoBaseAltura();
				float Base= Float.valueOf(textBase.getText());
				float Altura= Float.valueOf(textAltura.getText());
				
				if(rdbtnRadioArea.isSelected()) {
					float area= c.CalcularAREA(Base, Altura);
					lblResultado.setText("Área: " + area);
					
				}else if(rdbtnRadioPerimetro.isSelected()) {
					float perimetro= c.CalcularPERIMETRO(Base, Altura);
					lblResultado.setText("Perímetro: " + perimetro);
				}
			}
		});
		btnCalcular.setBounds(172, 188, 89, 23);
		contentPane.add(btnCalcular);
		
	}
}
