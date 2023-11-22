package model;

public class Calculos {

	public float ValorDiesel,ValorComum,ValorAditivada,ValorEtanol,Valor500ml,Valor1l,Quanti500ml,Quanti1l,Total1l,Total500ml,TotalCombustivel,TotalOleo;
	public String Total;
	
	
	
	public String Diesel(float QuantidadeLitro) {
		String resultado=String.valueOf(ValorDiesel*QuantidadeLitro);
		TotalCombustivel=Float.valueOf(resultado);
		return resultado;
	}
	public String Comum(float QuantidadeLitro) {
		String resultado=String.valueOf(ValorComum*QuantidadeLitro);
		TotalCombustivel=Float.valueOf(resultado);
		return resultado;
	}
	public String Aditivada(float QuantidadeLitro) {
		String resultado=String.valueOf(ValorAditivada*QuantidadeLitro);
		TotalCombustivel=Float.valueOf(resultado);
		return resultado;
	}
	public String Etanol(float QuantidadeLitro) {
		String resultado=String.valueOf(ValorEtanol*QuantidadeLitro);
		TotalCombustivel=Float.valueOf(resultado);
		return resultado;
	}
	
	
	public String Class500ml() {
		String resultado=String.valueOf(Quanti500ml*Valor500ml);
		Total500ml=Float.valueOf(resultado);
		return resultado;
	}
	public String Class1l() {
		String resultado=String.valueOf(Quanti1l*Valor1l);
		Total1l=Float.valueOf(resultado);
		return resultado;
	}
	
	
	public String ValorTotalOleo() {
		String resultado=String.valueOf(Total1l+Total500ml);
		TotalOleo=Float.valueOf(resultado);
		return resultado;
	}
	public String TotalVista() {
		String resultadoT=String.valueOf((TotalCombustivel+TotalOleo)-((TotalCombustivel+TotalOleo)*0.10));
		Total=resultadoT;
		return Total;
	}
	public String TotalPrazo() {
		String resultadoT=String.valueOf(TotalCombustivel+TotalOleo);
		return resultadoT;
	}
	public String TotalPrazo30() {
		String resultadoT=String.valueOf((TotalCombustivel+TotalOleo)+((TotalCombustivel+TotalOleo)*0.10));
		return resultadoT;
	}

}
