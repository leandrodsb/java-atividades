package Aulas.Aula13;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o valor do raio da circunfer�ncia em (cm):");
		double raio = scan.nextDouble();
		double area = Math.PI*Math.pow(raio, 2);
		System.out.println("�rea:" +area +" cm^2");
		
	}

}
