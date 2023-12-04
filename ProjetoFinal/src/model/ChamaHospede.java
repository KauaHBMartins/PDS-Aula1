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
		listaPessoas.add(p);
		
	}

}
