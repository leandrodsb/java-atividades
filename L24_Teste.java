package Aula24;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Carro picape = new Carro();
		picape.consumo = 5;
		System.out.println("Informe a quantidade de quilometros rodados:");
		double distancia = input.nextDouble();
		System.out.println("Combustivel: " +picape.calcularCombustivel(distancia)+ " litros");
	}

}
