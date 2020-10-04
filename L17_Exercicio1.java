package Aula17;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota;
		String Resp;
		do {
			System.out.println("Insira uma nota de 0 a 10:");
			nota = scan.nextDouble();
			if(nota>10 || nota<0 ) {
				do {
					System.out.println("Valor inválido. Insira uma nota de 0 a 10:");
					nota = scan.nextDouble();
				}while(nota>10 || nota<0);
			}
			System.out.println("\nNota: " +nota);
			System.out.println("\nDeseja repetir o processo?");
			Resp = scan.next();
		} while (Resp.equalsIgnoreCase("Sim") || Resp.equalsIgnoreCase("S"));
		if(Resp.equalsIgnoreCase("Não") || Resp.equalsIgnoreCase("Nao") || Resp.equalsIgnoreCase("N")){
			System.out.println("\nFinalizado.");
		}
	}

}
