package Aulas.Aula13;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor do seu sal�rio (por hora):");
		double sal = scan.nextDouble();
		System.out.println("Insira o n�mero de horas trabalhadas durante o m�s:");
		double horas = scan.nextDouble();
		System.out.println("Seu sal�rio no m�s � de: R$ " + sal*horas);
		
	}

}
