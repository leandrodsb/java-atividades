package aula14;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um n�mero inteiro positivo:");
		int num = input.nextInt();
		if(num%2==0 && num>0) {
			System.out.println(num+" � um n�mero par.");
		} else if(num%2!=0){
			System.out.println(num+" � um n�mero �mpar.");
		} else {
			System.out.println("N�mero inv�lido.");
			
		}
	}
}
