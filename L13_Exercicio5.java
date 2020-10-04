package Aulas.Aula13;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor em metros (m):");
		double metro = scan.nextDouble();
		System.out.println("Valor em centímetros:");
		System.out.println(metro*100 + " cm");
		

	}

}
