package aula14;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean replay=true;
		while(replay) {
			System.out.println("Insira os números desejados.\nNúmero 1:");
			int num1 = input.nextInt();
			System.out.println("Número 2:");
			int num2 = input.nextInt();
			System.out.println("Qual operação você deseja realizar?\n1-Par ou Impar? / 2-Positivo ou negativo?");
			int op = input.nextInt();
			while(op!=1 && op!=2) {
				System.out.println("Opção selecionada inválida. Insira novamente.\n1-Par ou Impar? / 2-Positivo ou negativo?");
				op = input.nextInt();
			}
			switch (op) {
			case 1:
				if(num1%2==0 && num2%2==0) {
					System.out.println(num1+" e "+num2+ " são números pares.");
				}else if(num1%2 == 0) {
					System.out.println(num1+" é par e "+num2+ " é ímpar.");
				}else if(num2%2==0) {
					System.out.println(num2+" é par e "+num1+ " é ímpar.");
				}else {
					System.out.println(num1+" e "+num2+ " são números ímpares.");
				} break;
			case 2:
				if(num1>0 && num2>0) {
					System.out.println(num1+" e "+num2+ " são números positivos.");
				} else if(num1>0 && num2<0) {
					System.out.println(num1+" é positivo e "+num2+ " é negativo.");
				} else if(num1<0 && num2>0) {
					System.out.println(num1+" é negativo e "+num2+ " é positivo.");
				} else {
					System.out.println(num1+" e "+num2+ " são iguais a 0");
				} break;
			}
			System.out.println("Deseja repetir? (1=Sim/0=Não)");
			op = input.nextInt();
			switch (op) {
			case 0: replay = false; break;
			case 1: replay = true; break;
			}

		}	
	}

}
