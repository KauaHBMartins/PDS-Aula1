package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentoGrid extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnCalcular;
	private JLabel lblNewLabel_4;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField textDPmensal;
	private JTextField textNumJuros;
	private JTextField textJurosMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentoGrid frame = new CalculadoraInvestimentoGrid();
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
	public CalculadoraInvestimentoGrid() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 4, 0, 0));
		
		lblNewLabel = new JLabel("Depósito mensal R$:");
		contentPane.add(lblNewLabel);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		textDPmensal = new JTextField();
		panel_2.add(textDPmensal);
		textDPmensal.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Num. meses:");
		contentPane.add(lblNewLabel_2);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		textNumJuros = new JTextField();
		panel_3.add(textNumJuros);
		textNumJuros.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Juros ao mês %:");
		contentPane.add(lblNewLabel_1);
		
		panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		textJurosMes = new JTextField();
		panel_4.add(textJurosMes);
		textJurosMes.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Total investido + Juros R$:");
		contentPane.add(lblNewLabel_4);
		
		panel = new JPanel();
		contentPane.add(panel);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Float.valueOf(textDPmensal.getText());
				float j = Float.valueOf(textDPmensal.getText());
				float dm = Float.valueOf(textDPmensal.getText());
				Investimento c = new Investimento(a,j,dm);
				float calculaTotal =c.calculaTotal();
				JOptionPane.showMessageDialog(null, "Total investido + Juros R$ : " + calculaTotal);
			}
		});
		contentPane.add(btnCalcular);
	}

}
