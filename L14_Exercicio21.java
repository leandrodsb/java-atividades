package aula14;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o tipo de combustivel escolhido?\n(G=Gasolina/A=Álcool)");
		String fuel = input.next();
		System.out.println("Quantos litros?");
		double litros = input.nextDouble();
		double preco=0;
		switch (fuel) {
		case "A":
			if(litros>20) {
				preco = 1.9*litros*0.95;
			}else {
				preco = 1.9*litros*0.97;
			}break;
		case "G":
			if(litros>20) {
				preco = 2.5*litros*0.94;
			}else {
				preco = 2.5*litros*0.96;
			}break;
		}
		System.out.println("Preço final: R$ "+preco);
	}

}
