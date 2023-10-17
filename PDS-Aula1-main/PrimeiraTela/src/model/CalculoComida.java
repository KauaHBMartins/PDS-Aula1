package model;

public class CalculoComida {

	public float CalculoRefeicao(float Preco, float Peso) {
		float PrecoFinal = ((Peso-0.3)*Preco);
		return PrecoFinal;
	}
	

}
