package model;
import java.util.ArrayList;

public class ChamaHospede {
    private static ChamaHospede instancia;
    private ArrayList<Pessoa> listaPessoas;
    
    private ChamaHospede() {
        listaPessoas = new ArrayList<>();
    }
    
    public static ChamaHospede getInstancia() {
        if (instancia == null) {
            instancia = new ChamaHospede();
        }
        return instancia;
    }
	
	public static void main(String[] args) {
		
	}
	
	public void adicionarUsuario(Pessoa p) {
	    // Extraindo informações do objeto Pessoa
	    String nome = p.getNome();
	    int cpf = p.getCpf();
	    // Recupere outras informações necessárias

	    // Exibindo os valores recuperados (opcional)
	    System.out.println("Nome: " + nome);
	    System.out.println("CPF: " + cpf);
	    // Exiba outras informações, se necessário

	    // Adicionando a pessoa à lista
	    listaPessoas.add(p);

	    System.out.println("Usuário adicionado: " + nome);
	}
	
}
