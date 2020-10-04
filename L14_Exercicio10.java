package aula14;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o turno atual: \nM-Matutino \nV-Vespertino \nN-Norturno");
		String turno = scan.next();
		if(turno.length()>1) {
			System.out.println("Valor inválido!");
		}else {
			switch(turno) {
				case "m": 
				case "M": System.out.println("Bom dia!"); break;
				case "v": 
				case "V": System.out.println("Boa tarde!"); break;
				case "n": 
				case "N": System.out.println("Boa noite!"); break;
				default: System.out.println("Valor inválido!"); break;

			}
		}
	}
}
