package aula14;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira a quantidade de morangos comprados (em Kg):");
		double stwBerry = input.nextDouble();
		System.out.println("Insira a quantidade de maçãs compradas (em Kg):");
		double apple = input.nextDouble();
		double precoApple, precoStw;
		if (stwBerry<5) {
			precoStw = 2.5;
		}else {
			precoStw = 2.2;
		}
		if (apple<5) {
			precoApple = 1.8;
		}else {
			precoApple = 1.5;
		}
		double totalQtd, finalPreco;
		totalQtd = stwBerry+apple;
		finalPreco = apple*precoApple +  stwBerry*precoStw;
		if(finalPreco>25 || totalQtd>8) {
			System.out.println("Desconto 10%");
			finalPreco*= 0.9;
		}
		System.out.println("\nQtd. morango: "+stwBerry+" Kg");
		System.out.println("Qtd. maçã: "+apple+" Kg");
		System.out.println("\nPreço final: R$ "+finalPreco);
	}

}
