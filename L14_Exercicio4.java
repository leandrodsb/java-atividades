package aula14;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira a letra desejada:");
		String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Entrada Inválida.");
		} else if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
	}
}
