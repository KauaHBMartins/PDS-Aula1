package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;

import model.Calculos;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.DefaultComboBoxModel;
import model.Combobox;

public class PostoGasolina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textOleoDisel;
	private JTextField textEtanol;
	private JTextField textGasAditivada;
	private JTextField textGasComum;
	private JTextField textValorFrasco500;
	private JTextField textValorFrasco1;
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
		
		JPanel panelTabelaPrecoCombustivel = new JPanel();
		panelTabelaPrecoCombustivel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelTabelaPrecoCombustivel, "cell 0 0,grow");
		panelTabelaPrecoCombustivel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblOleoDisel = new JLabel("Oleo Disel:");
		lblOleoDisel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblOleoDisel);
		
		textOleoDisel = new JTextField();
		panelTabelaPrecoCombustivel.add(textOleoDisel);
		textOleoDisel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas. Comum:");
		lblGasComum.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblGasComum);
		
		textGasComum = new JTextField();
		panelTabelaPrecoCombustivel.add(textGasComum);
		textGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada:");
		lblGasAditivada.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblGasAditivada);
		
		textGasAditivada = new JTextField();
		panelTabelaPrecoCombustivel.add(textGasAditivada);
		textGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		lblEtanol.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblEtanol);
		
		textEtanol = new JTextField();
		panelTabelaPrecoCombustivel.add(textEtanol);
		textEtanol.setColumns(10);
		
		JPanel panelTabelaPrecoOleoMotor = new JPanel();
		panelTabelaPrecoOleoMotor.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(panelTabelaPrecoOleoMotor, "cell 1 0,grow");
		panelTabelaPrecoOleoMotor.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Frasco 500ml");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoOleoMotor.add(lblNewLabel_1);
		
		textValorFrasco500 = new JTextField();
		panelTabelaPrecoOleoMotor.add(textValorFrasco500);
		textValorFrasco500.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Frasco 1L");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoOleoMotor.add(lblNewLabel);
		
		textValorFrasco1 = new JTextField();
		panelTabelaPrecoOleoMotor.add(textValorFrasco1);
		textValorFrasco1.setColumns(10);
		
		JPanel panelOleoMotor = new JPanel();
		panelOleoMotor.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelOleoMotor, "cell 0 1 2 1,grow");
		panelOleoMotor.setLayout(new GridLayout(3, 4, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panelOleoMotor.add(panel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Valor a Pagar");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Total Oleo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Frascos de 500ml");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblNewLabel_5);
		
		textQuantidade500 = new JTextField();
		panelOleoMotor.add(textQuantidade500);
		textQuantidade500.setColumns(10);
		
		JLabel lblResultado_1 = new JLabel("-");
		lblResultado_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
		});
		lblResultado_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblResultado_1);
		
		JLabel lblResultado_2 = new JLabel("-");
		lblResultado_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblResultado_2);
		
		JLabel lblNewLabel_4 = new JLabel("Frascos de 1L");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblNewLabel_4);
		
		textQuantidade1 = new JTextField();
		panelOleoMotor.add(textQuantidade1);
		textQuantidade1.setColumns(10);
		
		JLabel lblResultado_4 = new JLabel("-");
		lblResultado_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Calculos c = new Calculos();
				float total500 = c.oleo500(textValorFrasco500, textQuantidade500);
			}
		});
		lblResultado_4.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblResultado_4);
		
		JPanel panel_5_1 = new JPanel();
		panelOleoMotor.add(panel_5_1);
		
		JPanel panelTabelaAbastecimento = new JPanel();
		panelTabelaAbastecimento.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelTabelaAbastecimento, "cell 0 2,grow");
		panelTabelaAbastecimento.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Combustivel:");
		panelTabelaAbastecimento.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Combobox.values()));
		panelTabelaAbastecimento.add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Quantidade Litros:");
		panelTabelaAbastecimento.add(lblNewLabel_9);
		
		textQuantidadeDeLitros = new JTextField();
		panelTabelaAbastecimento.add(textQuantidadeDeLitros);
		textQuantidadeDeLitros.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Total Combustivel:");
		panelTabelaAbastecimento.add(lblNewLabel_7);
		
		JLabel lblResultado_4_1 = new JLabel("-");
		lblResultado_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaAbastecimento.add(lblResultado_4_1);
		
		JPanel panelTabelaFormaDePagamento = new JPanel();
		panelTabelaFormaDePagamento.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelTabelaFormaDePagamento, "cell 1 2,grow");
		panelTabelaFormaDePagamento.setLayout(new GridLayout(3, 3, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Á vista");
		panelTabelaFormaDePagamento.add(rdbtnNewRadioButton);
		
		JPanel panel_7 = new JPanel();
		panelTabelaFormaDePagamento.add(panel_7);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Á prazo");
		panelTabelaFormaDePagamento.add(rdbtnNewRadioButton_1);
		
		JPanel panel_6 = new JPanel();
		panelTabelaFormaDePagamento.add(panel_6);
		
		JLabel lblNewLabel_10 = new JLabel("Dias:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_10);
		
		textQuantidadeDeDias = new JTextField();
		panel_6.add(textQuantidadeDeDias);
		textQuantidadeDeDias.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Total a Pagar:");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaFormaDePagamento.add(lblNewLabel_11);
		
		JLabel lblResultado_4_2 = new JLabel("-");
		lblResultado_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaFormaDePagamento.add(lblResultado_4_2);
		
		JPanel panelBotoesDeAcao = new JPanel();
		getContentPane().add(panelBotoesDeAcao, "cell 0 3 2 1,grow");
		panelBotoesDeAcao.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnButtonCalcular = new JButton("Calcular");
		btnButtonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float vOleoDisel=Float.valueOf(textOleoDisel.getText());
				float vGasComum=Float.valueOf(textGasComum.getText());
				float vGasAditivada=Float.valueOf(textGasAditivada.getText());
				float vEtanol=Float.valueOf(textEtanol.getText());
				float vValorFrasco500=Float.valueOf(textValorFrasco500.getText());
				float vValorFrasco1=Float.valueOf(textValorFrasco1.getText());
				
				float vQuantidade500=Float.valueOf(textQuantidade500.getText());
				float vQuantidade1=Float.valueOf(textQuantidade1.getText());
				
				float vQuantidadeDeLitros=Float.valueOf(textQuantidadeDeLitros.getText());
			}
		});
		panelBotoesDeAcao.add(btnButtonCalcular);
		
		JPanel panel_10 = new JPanel();
		panelBotoesDeAcao.add(panel_10);
		
		JButton btnButtonNovoCalculo = new JButton("Novo Calculo");
		btnButtonNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOleoDisel.setText("");
				textGasComum.setText("");
				textGasAditivada.setText("");
				textEtanol.setText("");
				textValorFrasco500.setText("");
				textValorFrasco1.setText("");
				textQuantidade500.setText("");
				textQuantidade1.setText("");
				textQuantidadeDeLitros.setText("");
				textQuantidadeDeDias.setText("");
			}
		});
		panelBotoesDeAcao.add(btnButtonNovoCalculo);
		
		JPanel panel_9 = new JPanel();
		panelBotoesDeAcao.add(panel_9);
		
		JButton btnButtonFechar = new JButton("Fechar");
		btnButtonFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panelBotoesDeAcao.add(btnButtonFechar);
	}

}
