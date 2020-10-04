package Aulas.Aula13;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a temperatura em graus Celsius:");
		double grauc = scan.nextDouble();
		double grauf = (9*grauc/5) + 32;
		System.out.println("A temperatura em Farenheit: " + grauf + " F");

	}

}
