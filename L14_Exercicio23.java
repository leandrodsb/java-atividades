package aula14;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Selecione a opção de carne a ser comprada./n(1-Filé Duplo/2-Alcatra/3-Picanha)");
		int op = input.nextInt();
		while(op<1 || op>3) {
			System.out.println("Opção inválida. Insira novamente.\n(1-Filé Duplo/2-Alcatra/3-Picanha)");
			op = input.nextInt();
			break;
		}
		
		System.out.println("Informe a quantidade comprada (em Kg)");
		double qtde = input.nextDouble();
		double precoKg=0;
		System.out.println("Possui cartão Tabajara? (1-Sim/0-Não)");
		int opCard = input.nextInt();
		while(opCard!=1 && opCard!=0) {
			System.out.println("Opção inválida. Insira novamente.\n(1-Sim/0-Não)");
			opCard = input.nextInt();
			break;
		}

		switch (op) {
		case 1: System.out.println("\nOpção selecionada: Filé Duplo\n");
			if(qtde<=5) {
				precoKg = 4.9;
			}else {
				precoKg = 5.8;
			}
			break;
		case 2: System.out.println("\nOpção selecionada: Alcatra\n");
			if(qtde<=5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
			break;
		case 3: System.out.println("\nOpção selecionada: Picanha\n");
			if(qtde<=5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
			break;
		default: break;
		}
		if(opCard == 1) {
			System.out.println("Quantidade comprada: "+qtde+" Kg\nPreço por Kg: R$ "+precoKg);
			System.out.println("Preço total: R$ "+qtde*precoKg+"\nTipo de pagamento: Cartão Tabajara");
			System.out.println("Desconto: 5%\nTotal à pagar: R$" +qtde*precoKg*0.95);
		} else {
			System.out.println("Quantidade comprada: "+qtde+" Kg\nPreço por Kg: R$ "+precoKg);
			System.out.println("Preço total: R$ "+qtde*precoKg+"\nTipo de pagamento: Dinheiro/outro");
			System.out.println("Desconto: Sem desconto\nTotal à pagar: R$" +qtde*precoKg);
		}
	}
}

