package Aulas.Aula13;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor do lado do quadrado (m):");
		double lado = scan.nextDouble();
		System.out.println("Área do quadrado: " +Math.pow(lado, 2) + " m");
		System.out.println("Dobro da área do quadrado: " +2*Math.pow(lado, 2) + " m");

	}

}
