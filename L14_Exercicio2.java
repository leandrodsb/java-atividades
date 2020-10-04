package aula14;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um numero inteiro:");
		int num = scan.nextInt();
		if (num>0) {
			System.out.println("Número inserido é positivo.");
		} else if (num<0) {
			System.out.println("Número inserido é negativo.");
		} else {
			System.out.println("O número inserido é nulo (Igual à 0).");
		}

	}

}
