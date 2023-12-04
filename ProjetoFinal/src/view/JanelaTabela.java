package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import model.Pessoa;
import model.ChamaHospede;
public class JanelaTabela extends JFrame {
	 private JTable table;
	    private ArrayList<Pessoa> listaPessoas;
	 public JanelaTabela(ArrayList<Pessoa> listaPessoas) {
	 }
	 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTabela frame = new JanelaTabela();
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
	public JanelaTabela() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 28, 714, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF", "Email", "Telefone", "Nascimento", "Endere\u00E7o", "Cidade", "CEP"
			}
		));
		
		for (Pessoa pessoa : listaPessoas) {
            model.addRow(new Object[] {
                pessoa.getNome(), pessoa.getCpf(), pessoa.getEmail(), pessoa.getTelefone(),
                pessoa.getNascimento(), pessoa.getEndereco(), pessoa.getCidade(), pessoa.getCep()
            });
        }
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(127, 400, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.setBounds(277, 400, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
