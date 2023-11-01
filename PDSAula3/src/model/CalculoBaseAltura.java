package model;

public class CalculoBaseAltura {
	
	public float CalcularPERIMETRO(float Base, float Altura) {
		float  perimetro = 2*(Base+Altura);
		return perimetro;
	}
	
	public float CalcularAREA(float Base, float Altura) {
		float  area = Base*Altura;
		return area;
	}
}
