package aula14;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira 3 números:");
		int num1 = scan.nextInt(); int num2 = scan.nextInt(); int num3 = scan.nextInt();
		if(num1<=num2 && num1<=num3 && num2<=num3) {
			System.out.println("\n" +num3 + "\n" +num2 + "\n" + num1);
		} else if(num1<=num2 && num1<=num3 && num3<=num2) {
			System.out.println("\n" +num2 + "\n" +num3 + "\n" + num1);
		} else if(num2<=num1 && num2<=num3 && num1<=num3) {
			System.out.println("\n" +num3 + "\n" +num1 + "\n" + num2);
		} else if (num2<=num1 && num2<=num3 && num3<=num1) {
			System.out.println("\n" +num1 + "\n" +num3 + "\n" + num2);
		} else if (num3<=num1 && num3<=num2 && num2<=num1) {
			System.out.println("\n" +num1 + "\n" +num2 + "\n" + num3);
		} else if (num3<=num1 && num3<=num2 && num1<=num2){
			System.out.println("\n" +num2 + "\n" +num1 + "\n" + num3);
		}
	}

}
