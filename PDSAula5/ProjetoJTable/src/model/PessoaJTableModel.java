package model;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PessoaJTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Pessoa> lista;
	private String[] colunas ={"Nome", "CPF ", "Telefone","Idade","Peso","Altura" };
	
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
			return p.getNomePessoa();
		} else if(columnIndex == 1) {
			return p.getCpfPessoa();
		} else if(columnIndex == 2) {
			return p.getTelefonePessoa();
		} else if(columnIndex == 3) {
			return p.getIdadePessoa();
		} else if(columnIndex == 4) {
			return p.getPesoPessoa();
		} else if(columnIndex == 5) {
			return p.getAlturaPessoa();
		}
		
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
