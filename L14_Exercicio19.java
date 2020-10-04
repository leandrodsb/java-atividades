package aula14;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean replay=true;
		while(replay) {
			System.out.println("Insira os n�meros desejados.\nN�mero 1:");
			int num1 = input.nextInt();
			System.out.println("N�mero 2:");
			int num2 = input.nextInt();
			System.out.println("Qual opera��o voc� deseja realizar?\n1-Par ou Impar? / 2-Positivo ou negativo?");
			int op = input.nextInt();
			while(op!=1 && op!=2) {
				System.out.println("Op��o selecionada inv�lida. Insira novamente.\n1-Par ou Impar? / 2-Positivo ou negativo?");
				op = input.nextInt();
			}
			switch (op) {
			case 1:
				if(num1%2==0 && num2%2==0) {
					System.out.println(num1+" e "+num2+ " s�o n�meros pares.");
				}else if(num1%2 == 0) {
					System.out.println(num1+" � par e "+num2+ " � �mpar.");
				}else if(num2%2==0) {
					System.out.println(num2+" � par e "+num1+ " � �mpar.");
				}else {
					System.out.println(num1+" e "+num2+ " s�o n�meros �mpares.");
				} break;
			case 2:
				if(num1>0 && num2>0) {
					System.out.println(num1+" e "+num2+ " s�o n�meros positivos.");
				} else if(num1>0 && num2<0) {
					System.out.println(num1+" � positivo e "+num2+ " � negativo.");
				} else if(num1<0 && num2>0) {
					System.out.println(num1+" � negativo e "+num2+ " � positivo.");
				} else {
					System.out.println(num1+" e "+num2+ " s�o iguais a 0");
				} break;
			}
			System.out.println("Deseja repetir? (1=Sim/0=N�o)");
			op = input.nextInt();
			switch (op) {
			case 0: replay = false; break;
			case 1: replay = true; break;
			}

		}	
	}

}
