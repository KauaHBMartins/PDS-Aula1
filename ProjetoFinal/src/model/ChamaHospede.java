package model;


public class ChamaHospede {
    private static ChamaHospede instancia;
    private ChamaHospede() {
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
		// TODO Auto-generated method stub
		
	}

}
