package model;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PessoaJTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Pessoa> lista;
	private String[] colunas ={"Nome", "CPF", "Email", "Telefone", "Nascimento", "Endereço", "Cidade", "CEP"};
	
	public PessoaJTableModel(ArrayList<Pessoa> lista) {
		this.lista=lista;
	}
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pessoa p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} else if(columnIndex == 1) {
			return p.getCpf();
		} else if(columnIndex == 2) {
			return p.getEmail();
		} else if(columnIndex == 3) {
			return p.getTelefone();
		} else if(columnIndex == 4) {
			return p.getNascimento();
		} else if(columnIndex == 5) {
			return p.getEndereco();
		} else if(columnIndex == 6) {
			return p.getCidade();
		} else if(columnIndex == 7) {
			return p.getCep();
		}
		
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
