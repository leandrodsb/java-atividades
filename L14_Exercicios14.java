package aula14;
import java.util.Scanner;

public class Exercicios14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira as notas parciais do aluno.");
		System.out.println("Nota 1:");
		double n1 = scan.nextDouble();
		System.out.println("Nota 2:");
		double n2 = scan.nextDouble();
		double media = (n1+n2)/2;
		String Conceito;
		if(media>=9 && media <= 10) {
			Conceito = "A";
		} else if (media<9 && media>= 7.5) {
			Conceito = "B";
		} else if (media<7.5 && media>=6) {
			Conceito = "C";
		} else if(media<6 && media>=4) {
			Conceito = "D";
		} else {
			Conceito = "F";
		}
		if(Conceito.equals("A") || Conceito.equals("B") || Conceito.equals("C")) {
			System.out.println("Média do aluno: "+media+"\nConceito: " + Conceito + "\nAprovado" );
			
		} else {
			System.out.println("Média do aluno: "+media+"\nConceito: " + Conceito + "\nReprovado" );
		}
	}

}
