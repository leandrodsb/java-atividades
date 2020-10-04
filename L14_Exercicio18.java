package aula14;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um número inteiro positivo:");
		int num = input.nextInt();
		if(num%2==0 && num>0) {
			System.out.println(num+" é um número par.");
		} else if(num%2!=0){
			System.out.println(num+" é um número ímpar.");
		} else {
			System.out.println("Número inválido.");
			
		}
	}
}
