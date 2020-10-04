package Aulas.Aula13;
import java.util.Scanner;

public class Exercicios13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira o valor de sua remuneração por hora: ");
		double salh = scan.nextDouble();
		System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		double salbruto = salh*horas;
		System.out.println("Salário bruto: " +(salbruto) + " R$");
		System.out.println("Imposto sindicato: " +(salbruto*0.05) + " R$");
		System.out.println("INSS: " +(salbruto*0.08) + " R$");
		System.out.println("Salário líquido: " +(salbruto*0.76) + " R$");
	}

}
