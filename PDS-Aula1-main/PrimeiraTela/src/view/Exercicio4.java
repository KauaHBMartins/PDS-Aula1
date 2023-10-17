package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalculoLitros;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SegundoExercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrecoLitro;
	private JTextField textPrecoFinal;
	private JButton btnLimpar;
	private JButton btnCL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundoExercicio4 frame = new Exercico4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPrecoLitro = new JTextField();
		textPrecoLitro.setBounds(205, 48, 86, 20);
		contentPane.add(textPrecoLitro);
		textPrecoLitro.setColumns(10);
		
		textPrecoFinal = new JTextField();
		textPrecoFinal.setBounds(205, 89, 86, 20);
		contentPane.add(textPrecoFinal);
		textPrecoFinal.setColumns(10);
		
		JLabel lblPrecoLitro = new JLabel("Informe o preço do litro:");
		lblPrecoLitro.setBounds(75, 51, 123, 14);
		contentPane.add(lblPrecoLitro);
		
		JLabel lblPrecoFinal = new JLabel("Informe o valor inserido do cliente:");
		lblPrecoFinal.setBounds(20, 92, 219, 14);
		contentPane.add(lblPrecoFinal);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(75, 174, 89, 23);
		contentPane.add(btnFechar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPrecoFinal.setText(null);
				textPrecoLitro.setText(null);
			}
		});
		btnLimpar.setBounds(236, 174, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCL = new JButton("Calcular Litros");
		btnCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float PrecoLitro= Float.valueOf(textPrecoLitro.getText());
				float PrecoFinal= Float.valueOf(textPrecoFinal.getText());
				CalculoGasolina c = new CalculoGasolina();
				float PrecoTotal = c.Calcular(PrecoLitro, PrecoFinal);
				JOptionPane.showMessageDialog(null, "O valor é de :"+ PrecoTotal);
				
			}
		});
		btnCL.setBounds(148, 139, 123, 23);
		contentPane.add(btnCL);
	}
}