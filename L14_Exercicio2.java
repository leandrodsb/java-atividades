package aula14;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um numero inteiro:");
		int num = scan.nextInt();
		if (num>0) {
			System.out.println("N�mero inserido � positivo.");
		} else if (num<0) {
			System.out.println("N�mero inserido � negativo.");
		} else {
			System.out.println("O n�mero inserido � nulo (Igual � 0).");
		}

	}

}
