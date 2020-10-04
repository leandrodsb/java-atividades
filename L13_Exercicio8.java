package Aulas.Aula13;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor do seu salário (por hora):");
		double sal = scan.nextDouble();
		System.out.println("Insira o número de horas trabalhadas durante o mês:");
		double horas = scan.nextDouble();
		System.out.println("Seu salário no mês é de: R$ " + sal*horas);
		
	}

}
