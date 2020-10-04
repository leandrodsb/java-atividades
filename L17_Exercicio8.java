package Aula17;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notas = new double[5];
		double soma=0;
		for(int i=0;i<notas.length;i++) {
			System.out.println("Digite a nota "+(i+1)+":");
			notas[i] = input.nextDouble();
			soma+=notas[i];
		}
		double media = soma/notas.length;
		System.out.println("Soma das notas: "+soma+"\nMédia: "+media);
	}
}
