package Aula24;

public class Carro {
	double consumo;
	
	double calcularCombustivel (double km) {
		double qtdCombustivel = km/consumo;
		return qtdCombustivel;
	}
}
