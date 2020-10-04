package aula14;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira as notas do aluno.");
		System.out.println("Nota 1:");
		double n1 = scan.nextDouble();
		System.out.println("Nota 2:");
		double n2 = scan.nextDouble();
		double media = (n1+n2)/2;
		if(media == 10) {
			System.out.println("Aprovado com distinção.");
		} else if (media >= 7) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}
	}

}
