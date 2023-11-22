package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.DefaultComboBoxModel;
import model.Combobox;
import javax.swing.ButtonGroup;

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
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		Calculos c=new Calculos();
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
		textOleoDisel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.ValorDiesel=Float.valueOf(textOleoDisel.getText());
			}
		});
		panelTabelaPrecoCombustivel.add(textOleoDisel);
		textOleoDisel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas. Comum:");
		lblGasComum.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblGasComum);
		
		textGasComum = new JTextField();
		textGasComum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.ValorComum=Float.valueOf(textGasComum.getText());
			}
		});
		panelTabelaPrecoCombustivel.add(textGasComum);
		textGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada:");
		lblGasAditivada.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblGasAditivada);
		
		textGasAditivada = new JTextField();
		textGasAditivada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.ValorAditivada=Float.valueOf(textGasAditivada.getText());
			}
		});
		panelTabelaPrecoCombustivel.add(textGasAditivada);
		textGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		lblEtanol.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoCombustivel.add(lblEtanol);
		
		textEtanol = new JTextField();
		textEtanol.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.ValorEtanol=Float.valueOf(textEtanol.getText());
			}
		});
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
		textValorFrasco500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.Valor500ml=Float.valueOf(textValorFrasco500.getText());
			}
		});
		panelTabelaPrecoOleoMotor.add(textValorFrasco500);
		textValorFrasco500.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Frasco 1L");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaPrecoOleoMotor.add(lblNewLabel);
		
		textValorFrasco1 = new JTextField();
		textValorFrasco1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.Valor1l=Float.valueOf(textValorFrasco1.getText());
			}
		});
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
		
		JLabel lblValor500 = new JLabel("-");
		lblValor500.setHorizontalAlignment(SwingConstants.CENTER);
	
		
		JLabel lblValorTotal = new JLabel("-");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
	
		
		textQuantidade500 = new JTextField();
		textQuantidade500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.Quanti500ml=Float.valueOf(textQuantidade500.getText());
				lblValor500.setText("R$ "+c.Class500ml());
				lblValorTotal.setText("R$ "+c.ValorTotalOleo());
			}
		});
		panelOleoMotor.add(textQuantidade500);
		textQuantidade500.setColumns(10);
		panelOleoMotor.add(lblValor500);
		panelOleoMotor.add(lblValorTotal);
	
		JLabel lblNewLabel_4 = new JLabel("Frascos de 1L");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblNewLabel_4);
		
		JLabel lblValor1 = new JLabel("-");
		lblValor1.setHorizontalAlignment(SwingConstants.CENTER);
		panelOleoMotor.add(lblValor1);
		
		textQuantidade1 = new JTextField();
		textQuantidade1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.Quanti1l=Float.valueOf(textQuantidade1.getText());
				lblValor1.setText("R$ "+c.Class1l());
				lblValorTotal.setText("R$ "+c.ValorTotalOleo());
			}
		});
		panelOleoMotor.add(textQuantidade1);
		textQuantidade1.setColumns(10);
		
		
		panelOleoMotor.add(lblValor1);
		
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
		
		JLabel lblTotalComb = new JLabel("-");
		lblTotalComb.setHorizontalAlignment(SwingConstants.CENTER);
		
		textQuantidadeDeLitros = new JTextField();
		textQuantidadeDeLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int posicao=comboBox.getSelectedIndex();
				float QuantiLitros=Float.valueOf(textQuantidadeDeLitros.getText());
				if(posicao==0) {
					lblTotalComb.setText("R$ "+c.Diesel(QuantiLitros));
				}
				else if(posicao==1) {
					lblTotalComb.setText("R$ "+c.Comum(QuantiLitros));
				}
				else if(posicao==2) {
					lblTotalComb.setText("R$ "+c.Aditivada(QuantiLitros));
				}
				else if(posicao==3) {
					lblTotalComb.setText("R$ "+c.Etanol(QuantiLitros));
				}
			}
		});
		panelTabelaAbastecimento.add(textQuantidadeDeLitros);
		textQuantidadeDeLitros.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Total Combustivel:");
		panelTabelaAbastecimento.add(lblNewLabel_7);
		panelTabelaAbastecimento.add(lblTotalComb);
		JPanel panelTabelaFormaDePagamento = new JPanel();
		panelTabelaFormaDePagamento.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelTabelaFormaDePagamento, "cell 1 2,grow");
		panelTabelaFormaDePagamento.setLayout(new GridLayout(3, 3, 0, 0));
		
		JRadioButton rdbtnVista = new JRadioButton("Á vista");
		buttonGroup.add(rdbtnVista);
		panelTabelaFormaDePagamento.add(rdbtnVista);
		
		JPanel panel_7 = new JPanel();
		panelTabelaFormaDePagamento.add(panel_7);
		
		JRadioButton rdbtnPrazo = new JRadioButton("Á prazo");
		buttonGroup.add(rdbtnPrazo);
		panelTabelaFormaDePagamento.add(rdbtnPrazo);
		
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
		
		JLabel lblTotal = new JLabel("-");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		panelTabelaFormaDePagamento.add(lblTotal);
		
		JPanel panelBotoesDeAcao = new JPanel();
		getContentPane().add(panelBotoesDeAcao, "cell 0 3 2 1,grow");
		panelBotoesDeAcao.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnButtonCalcular = new JButton("Calcular");
		btnButtonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnVista.isSelected())
				{
					String resultadoT=c.TotalVista();
					lblTotal.setText("R$ "+resultadoT);
				}
				else if(rdbtnPrazo.isSelected())
				{
					Integer dias=Integer.valueOf(textQuantidadeDeDias.getText());
					if(dias<=30)
					{
					String resultadoT= c.TotalPrazo();
					lblTotal.setText("R$ "+resultadoT);
					}
					else if(dias>31) {
						String resultadoT=c.TotalPrazo30();
						lblTotal.setText("R$ "+resultadoT);
						}
				}
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
				lblTotal.setText(null);
				lblTotalComb.setText("-");
				lblValor1.setText("-");
				lblValor500.setText("-");
				lblValorTotal.setText("-");
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
