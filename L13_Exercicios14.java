package Aulas.Aula13;
import java.util.Scanner;

public class Exercicios14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o tamanho do arquivo para download (em MB):");
		double tam = scan.nextDouble();
		System.out.println("Insira a velocidade do link de internet (em Mbps):");
		double vel = scan.nextDouble();
		System.out.println("Tempo estimado de download: " +(tam/vel*8)/60 + " min.");

	}

}
