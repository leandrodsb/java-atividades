package aula14;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira dois valores numericos inteiros:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1>num2){
			System.out.println(num1);
		}else if (num2>num1) {
			System.out.println(num2);
		} else {
			System.out.println("Os dois números são iguais!");
		}
	}

}
