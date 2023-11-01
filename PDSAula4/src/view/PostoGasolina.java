package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class PostoGasolina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textOleoDisel;
	private JTextField textEtanol;
	private JTextField textGasAditivada;
	private JTextField textGasComum;
	private JTextField textQuantidadeFrasco500;
	private JTextField textQuantidadeFrasco1;
	private JTextField textQuantidade500;
	private JTextField textQuantidade1;
	private JTextField textQuantidadeDeLitros;
	private JTextField textQuantidadeDeDias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostoGasolina frame = new PostoGasolina();
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
	public PostoGasolina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 556);
		getContentPane().setLayout(new MigLayout("", "[grow][grow,center]", "[grow][grow][grow][grow]"));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel, "cell 0 0,grow");
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblOleoDisel = new JLabel("Oleo Disel:");
		lblOleoDisel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblOleoDisel);
		
		textOleoDisel = new JTextField();
		panel.add(textOleoDisel);
		textOleoDisel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas. Comum:");
		lblGasComum.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblGasComum);
		
		textGasComum = new JTextField();
		panel.add(textGasComum);
		textGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada:");
		lblGasAditivada.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblGasAditivada);
		
		textGasAditivada = new JTextField();
		panel.add(textGasAditivada);
		textGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		lblEtanol.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblEtanol);
		
		textEtanol = new JTextField();
		panel.add(textEtanol);
		textEtanol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(panel_1, "cell 1 0,grow");
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Frasco 500ml");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		textQuantidadeFrasco500 = new JTextField();
		panel_1.add(textQuantidadeFrasco500);
		textQuantidadeFrasco500.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Frasco 1L");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		textQuantidadeFrasco1 = new JTextField();
		panel_1.add(textQuantidadeFrasco1);
		textQuantidadeFrasco1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_2, "cell 0 1 2 1,grow");
		panel_2.setLayout(new GridLayout(3, 4, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Valor a Pagar");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Total Oleo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Frascos de 500ml");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_5);
		
		textQuantidade500 = new JTextField();
		panel_2.add(textQuantidade500);
		textQuantidade500.setColumns(10);
		
		JLabel lblResultado_1 = new JLabel("-");
		lblResultado_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblResultado_1);
		
		JLabel lblResultado_2 = new JLabel("-");
		lblResultado_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblResultado_2);
		
		JLabel lblNewLabel_4 = new JLabel("Frascos de 1L");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_4);
		
		textQuantidade1 = new JTextField();
		panel_2.add(textQuantidade1);
		textQuantidade1.setColumns(10);
		
		JLabel lblResultado_4 = new JLabel("-");
		lblResultado_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblResultado_4);
		
		JLabel lblResultado_3 = new JLabel("-");
		lblResultado_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblResultado_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_3, "cell 0 2,grow");
		panel_3.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Combustivel:");
		panel_3.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Quantidade Litros:");
		panel_3.add(lblNewLabel_9);
		
		textQuantidadeDeLitros = new JTextField();
		panel_3.add(textQuantidadeDeLitros);
		textQuantidadeDeLitros.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Total Combustivel:");
		panel_3.add(lblNewLabel_7);
		
		JLabel lblResultado_4_1 = new JLabel("-");
		lblResultado_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblResultado_4_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel_4, "cell 1 2,grow");
		panel_4.setLayout(new GridLayout(3, 3, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Á vista");
		panel_4.add(rdbtnNewRadioButton);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Á prazo");
		panel_4.add(rdbtnNewRadioButton_1);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		JLabel lblNewLabel_10 = new JLabel("Dias:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_10);
		
		textQuantidadeDeDias = new JTextField();
		panel_6.add(textQuantidadeDeDias);
		textQuantidadeDeDias.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Total a Pagar:");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblResultado_4_2 = new JLabel("-");
		lblResultado_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblResultado_4_2);
		
		JPanel panel_8 = new JPanel();
		getContentPane().add(panel_8, "cell 0 3 2 1,grow");
		panel_8.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnButtonCalcular = new JButton("Calcular");
		panel_8.add(btnButtonCalcular);
		
		JPanel panel_10 = new JPanel();
		panel_8.add(panel_10);
		
		JButton btnButtonNovoCalculo = new JButton("Novo Calculo");
		panel_8.add(btnButtonNovoCalculo);
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9);
		
		JButton btnButtonFechar = new JButton("Fechar");
		panel_8.add(btnButtonFechar);
	}

}
