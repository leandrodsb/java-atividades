package Aula17;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anos=0;
		int popA=80000, popB=200000;
		while(popA<=popB) {
			popA*=1.03;
			popB*=1.015;
			anos+=1;
		}
		System.out.println("Quantidade de anos: " +anos);
		System.out.println("Pop. cidade A: "+popA+" / Pop. cidade B: "+popB);

	}

}
