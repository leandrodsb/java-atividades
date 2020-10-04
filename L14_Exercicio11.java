package aula14;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor do seu salário atual: ");
		double sal = scan.nextDouble();
		double salnovo;
		if(sal <=280) {
			salnovo = sal*1.2;
		} else if(sal<=700) {
			salnovo = sal*1.15;
		} else if(sal<=1500) {
			salnovo = sal*1.1;
		} else {
			salnovo = sal*1.05;
		}
		System.out.println("\nSalário antes do reajuste: " +sal+ " R$");
		System.out.println("\nPercentual aplicado: " +(salnovo-sal)*100/sal+ " %");
		System.out.println("Valor de aumento: " +(salnovo-sal) + " R$");
		System.out.println("\nNovo salário: " +salnovo+ " R$");
	}

}
