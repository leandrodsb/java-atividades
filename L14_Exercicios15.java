package aula14;
import java.util.Scanner;

public class Exercicios15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o tamanho dos lados do triângulo em cm.");
		System.out.println("Lado 1:");
		double lado1 = scan.nextDouble();
		System.out.println("Lado 2:");
		double lado2 = scan.nextDouble();
		System.out.println("Lado 3:");
		double lado3 = scan.nextDouble();
		if(lado1+lado2<lado3 || lado3+lado1<lado2 || lado2+lado3<lado1) {
			System.out.println("Não é um triângulo.");
		}else {
			if(lado1==lado2 && lado1==lado3) {
				System.out.println("Triângulo equilátero.");
			}else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
				System.out.println("Triângulo isósceles.");
			}else {
				System.out.println("Triângulo escaleno.");
			}
		}

	}

}
