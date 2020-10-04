package Aula17;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira os dados.\nNome:");
		String nome = input.next();
		if(nome.length()<=3) {
			while(nome.length()<=3) {
				System.out.println("Valor inválido! Insira novamente seu nome.\n(Número de caracteres deve ser maior que 3)");
				nome = input.next();
			}
		}
		
		System.out.println("Idade:");
		int idade = input.nextInt();

		if(idade<0 || idade>150) {
			do {
				System.out.println("Valor inválido! Insira novamente sua idade.\n(Idade deve ser entre 0 e 150 anos.)");
				idade = input.nextInt();
			} while(idade<0 || idade>150);
		}
		System.out.println("Salário:");
		double cash = input.nextDouble();
		if(cash<0) {
			do {
				System.out.println("Valor inválido! Insira novamente seu salário.\n");
				cash = input.nextDouble();
			} while(cash<0);
		}
		System.out.println("Sexo:");
		String sexo = input.next();
		if(sexo.equalsIgnoreCase("M")==false && sexo.equalsIgnoreCase("F")==false ) {
			do {
				System.out.println("Valor inválido! Insira novamente.\n(M:masculino F:feminino)");
				sexo = input.next();
			}while(sexo.equalsIgnoreCase("M")==false && sexo.equalsIgnoreCase("F")==false );
			
		}
		System.out.println("Estado Civil:");
		String EstCiv = input.next();
		
		boolean flagCiv=true;
		while(flagCiv) {
			switch (EstCiv) {
			case "s": flagCiv = false; break;
			case "S": flagCiv = false; break;
			case "c": flagCiv = false; break;
			case "C": flagCiv = false; break;
			case "v": flagCiv = false; break;
			case "V": flagCiv = false; break;
			case "d": flagCiv = false; break;
			case "D": flagCiv = false; break;
			default: flagCiv = true; break;
			}
			if(flagCiv==true) {
				System.out.println("Valor inválido! Insira novamente.\n(S:Soleiro, C: Casado, V: Viuvo, D: Divorciado)");
				EstCiv = input.next();
			}
		}
		System.out.println("Dados inseridos!\n\nNome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Salário: " +cash+ " R$");
		if(sexo.equalsIgnoreCase("M")) {
			System.out.println("Sexo: Masculino");
			switch (EstCiv) {
			case "s": 
			case "S":  System.out.println("Estado Civil: Solteiro"); break;
			case "c":  
			case "C":  System.out.println("Estado Civil: Casado"); break;
			case "v": 
			case "V":  System.out.println("Estado Civil: Viuvo"); break;
			case "d":  
			case "D":  System.out.println("Estado Civil: Divorciado"); break;
			default: break;
			}
			
		} else if(sexo.equalsIgnoreCase("F")) {
			System.out.println("Sexo: Feminino");
			switch (EstCiv) {
			case "s": 
			case "S":  System.out.println("Estado Civil: Solteira"); break;
			case "c":  
			case "C":  System.out.println("Estado Civil: Casada"); break;
			case "v": 
			case "V":  System.out.println("Estado Civil: Viuva"); break;
			case "d":  
			case "D":  System.out.println("Estado Civil: Divorciada"); break;
			default: break;
			}
		}
		
	}

}

