package Aulas.Aula13;
import java.util.Scanner;


public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a sua altura em metros:");
		double altura = scan.nextDouble();
		System.out.println("Seu peso ideal é: " +(72.7*altura-58) + " kg");
	}
}
