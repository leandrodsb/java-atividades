package aula14;
import java.util.Scanner;

public class Exercicios12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o valor do seu salário por hora:");
		double valorh = scan.nextDouble();
		System.out.println("Insira a quantidade de horas trabalhadas no mês:");
		double horas = scan.nextDouble(); double salbruto = valorh*horas; double Syndicate = salbruto*0.03;
		double fgts = salbruto*0.11; double Inss = salbruto*0.1; double ImpRend;
		if ( salbruto <= 900 ) {
			ImpRend = 0;
		} else if(salbruto<=1500) {
			ImpRend = salbruto*0.05;
		} else if(salbruto <= 2500) {
			ImpRend = salbruto*0.1;
		} else {
			ImpRend = salbruto*0.2;
		}
		double Descontos = ImpRend+Inss+Syndicate;
		System.out.println("\nSalário bruto:" + salbruto + " R$");
		System.out.println("\nIR (" + 100*ImpRend/salbruto + " %): " + ImpRend + " R$");
		System.out.println("INSS:" + Inss + " R$");
		System.out.println("FGTS:" + fgts + " R$\n");
		System.out.println("Total de descontos:" + Descontos + " R$\n");
		System.out.println("Salário líquido: " + (salbruto+fgts-Descontos) + " R$");

	}

}
