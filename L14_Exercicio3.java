package aula14;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira M para masculino ou F para feminino:");
		String letra = scan.next();
		if (letra.equalsIgnoreCase("m")) {
			System.out.println("Sexo Masculino.");
		} else if(letra.equalsIgnoreCase("f")) {
			System.out.println("Sexo Feminino.");
		} else {
			System.out.println("Sexo inválido.");
		}
	}
}
