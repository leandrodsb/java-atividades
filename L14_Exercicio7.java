package aula14;
import java.util.Scanner;

//escreva um programa que leia 3 numeros e retorne o maior e o menor deles.

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira os n�meros a serem comparados.");
		System.out.println("N�mero 1:");
		int num1 = scan.nextInt();
		System.out.println("Numero 2:");
		int num2 = scan.nextInt();
		System.out.println("N�mero 3:");
		int num3 = scan.nextInt();
		if (num1>num2 && num1>num3) {
			System.out.println("Maior n�mero �: " +num1);
		} else if (num2>num1 && num2>num3) {
			System.out.println("Maior n�mero �: " +num2);
		} else {
			System.out.println("Maior n�mero �:" +num3);
		}
		if (num1<num2 && num1<num3) {
			System.out.println("Menor n�mero �: " +num1);
		} else if (num2<num1 && num2<num3) {
			System.out.println("Menor n�mero �: " +num2);
		} else {
			System.out.println("Menor n�mero �:" +num3);
		}

	}

}
