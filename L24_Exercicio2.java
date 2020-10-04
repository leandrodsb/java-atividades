package Aula24;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		boolean replay=true;
		while(replay) {
			Livro library = new Livro();
			Scanner input = new Scanner(System.in);
			System.out.print("Insira o título do livro desejado:\n");
			String nome = input.nextLine();
			library.title = nome;
			library.searchBook();
			System.out.println("\nDeseja repetir?\n");
			replay = input.nextBoolean();
		}
	}
}
