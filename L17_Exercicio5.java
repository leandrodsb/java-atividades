package Aula17;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean replay = true;
		int popA, popB,op, anos;
		double taxA,taxB;
		
		while(replay) {
			anos = 0;
			System.out.println("Insira a população da cidade A:");
			popA=input.nextInt();
			while(popA<0) {
				System.out.println("Qtde de população inválida. Insira valor positivo");
				popA=input.nextInt();
			}
			System.out.println("Insira a taxa de crescimento populacional da cidade A (em %):");
			taxA=input.nextDouble();
			while(taxA>100) {
				System.out.println("Taxa de crescimento inválida. Insira valor menor que 100%.");
				taxA=input.nextDouble();
			}
			System.out.println("Insira a população da cidade B:");
			popB=input.nextInt();
			while(popB<0) {
				System.out.println("Qtde de população inválida. Insira valor positivo");
				popB=input.nextInt();
			}
			System.out.println("Insira a taxa de crescimento populacional da cidade B (em %):");
			taxB=input.nextDouble();
			while(taxB>100) {
				System.out.println("Taxa de crescimento inválida. Insira valor menor que 100%.");
				taxB=input.nextDouble();
			}
			if(popA>popB) {
				while(popB<=popA) {
					popA*=(1+(taxA/100));
					popB*=(1+(taxB/100));
					anos+=1;
				}
			} else if(popB>popA) {
				while (popA<=popB) {
					popA*=(1+(taxA/100));
					popB*=(1+(taxB/100));
					anos+=1;
				}
			} else {
				System.out.println("Populações são iguais.");
			}
			System.out.println("População A: "+popA+" / População B:"+popB);
			System.out.println("Qtd. de anos:" +anos);
			System.out.println("\nDeseja repetir a operação? (1=Sim/0=Não)");
			op = input.nextInt();
			switch (op) {
			case 0: replay = false; break;
			case 1: replay = true; break;
			}
		}
		System.out.println("Operação finalizada.");

	}

}
