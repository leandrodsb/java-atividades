package aula14;
import java.util.Scanner;

public class Exercicios15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o tamanho dos lados do tri�ngulo em cm.");
		System.out.println("Lado 1:");
		double lado1 = scan.nextDouble();
		System.out.println("Lado 2:");
		double lado2 = scan.nextDouble();
		System.out.println("Lado 3:");
		double lado3 = scan.nextDouble();
		if(lado1+lado2<lado3 || lado3+lado1<lado2 || lado2+lado3<lado1) {
			System.out.println("N�o � um tri�ngulo.");
		}else {
			if(lado1==lado2 && lado1==lado3) {
				System.out.println("Tri�ngulo equil�tero.");
			}else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
				System.out.println("Tri�ngulo is�sceles.");
			}else {
				System.out.println("Tri�ngulo escaleno.");
			}
		}

	}

}
