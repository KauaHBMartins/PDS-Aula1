package model;

public class CalculoComida {

	public float CalculoRefeicao(float Preco, float Peso) {
		float PrecoFinal = (float) ((Peso-0.3)*Preco);
		return PrecoFinal;
	}
	

}
