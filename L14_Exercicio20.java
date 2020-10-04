package aula14;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		int soma=0;
		System.out.println("Telefonou para a vítima?\n(Sim=1/Não=0)\n");
		op = input.nextInt();
		while(op!=1 && op!=0) {
			System.out.println("Resposta inválida, insira novamente.\n(Sim=1/Não=0)\n");
			op = input.nextInt();
		}
		if(op==1) {
			soma+=1;
		}
		System.out.println("Esteve no local do crime?\n(Sim=1/Não=0)\n");
		op = input.nextInt();
		while(op!=1 && op!=0) {
			System.out.println("Resposta inválida, insira novamente.\n(Sim=1/Não=0)\n");
			op = input.nextInt();
		}
		if(op==1) {
			soma+=1;
		}
		System.out.println("Mora perto da vítima?\n(Sim=1/Não=0)\n");
		op = input.nextInt();
		while(op!=1 && op!=0) {
			System.out.println("Resposta inválida, insira novamente.\n(Sim=1/Não=0)\n");
			op = input.nextInt();
		}
		if(op==1) {
			soma+=1;
		}
		System.out.println("Devia para a vítima?\n(Sim=1/Não=0)\n");
		op = input.nextInt();
		while(op!=1 && op!=0) {
			System.out.println("Resposta inválida, insira novamente.\n(Sim=1/Não=0)\n");
			op = input.nextInt();
		}
		if(op==1) {
			soma+=1;
		}
		System.out.println("Já trabalhou com a vítima?\n(Sim=1/Não=0)\n");
		op = input.nextInt();
		while(op!=1 && op!=0) {
			System.out.println("Resposta inválida, insira novamente.\n(Sim=1/Não=0)\n");
			op = input.nextInt();
		}
		if(op==1) {
			soma+=1;
		}
		
		if(soma==2) {
			System.out.println("Suspeito.");
		}else if(soma>2 && soma <5) {
			System.out.println("Cúmplice.");
		} else if(soma ==5) {
			System.out.println("Assassino.");
		} else {
			System.out.println("Inocente.");
		}

	}

}
