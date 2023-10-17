import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;


public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaMundo = new JLabel("Olá Mundo!");
		lblOlaMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"nice");
			}
		});
		lblOlaMundo.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 15));
		lblOlaMundo.setForeground(new Color(0, 0, 0));
		lblOlaMundo.setBounds(25, 32, 104, 14);
		contentPane.add(lblOlaMundo);
		
		JButton btnFecharBotao = new JButton("Fechar");
		btnFecharBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFecharBotao.setBounds(288, 215, 89, 23);
		contentPane.add(btnFecharBotao);
		
		textNome = new JTextField();
		textNome.setBounds(161, 85, 162, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(105, 88, 46, 14);
		contentPane.add(lblNome);
		
		JButton btnValidarBotao = new JButton("Validar");
		btnValidarBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome);
			}
		});
		btnValidarBotao.setBounds(60, 215, 89, 23);
		contentPane.add(btnValidarBotao);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
			}
		});
		btnLimpar.setBounds(171, 215, 89, 23);
		contentPane.add(btnLimpar);
		}
	}

