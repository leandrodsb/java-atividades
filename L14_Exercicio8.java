package aula14;
import java.util.Scanner;


public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira os pre�os a serem comparados.");
		System.out.println("Pre�o 1: \nPre�o 2: \nPre�o 3:");
		double preco1 = scan.nextDouble(); double preco2 = scan.nextDouble(); double preco3 = scan.nextDouble();
		if (preco1<preco2 && preco1<preco3) {
			System.out.println("Produto mais barato: R$ " +preco1);
		} else if (preco2<preco1 && preco2<preco3) {
			System.out.println("Produto mais barato: R$ " +preco2);
		} else {
			System.out.println("Produto mais barato: R$ " +preco3);
		}
	}

}