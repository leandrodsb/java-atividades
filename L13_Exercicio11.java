package Aulas.Aula13;
import java.util.Scanner;

//inserir dois numeros inteiros e um real
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira dois números inteiros e um número real.");
		System.out.println("Inteiro 1:");
		int num1 = scan.nextInt();
		System.out.println("Inteiro 2:");
		int num2 = scan.nextInt();
		System.out.println("Real:");
		double num3 = scan.nextDouble();
		System.out.println("a) " +(2*num1*num2/2));
		System.out.println("b) " +(3*num1+num3));
		System.out.println("c) " +Math.pow(num3, 3));
	}

}
