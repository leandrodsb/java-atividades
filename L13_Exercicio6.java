package Aulas.Aula13;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o valor do raio da circunferência em (cm):");
		double raio = scan.nextDouble();
		double area = Math.PI*Math.pow(raio, 2);
		System.out.println("Área:" +area +" cm^2");
		
	}

}
