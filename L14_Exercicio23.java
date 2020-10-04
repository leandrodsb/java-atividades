package aula14;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Selecione a op��o de carne a ser comprada./n(1-Fil� Duplo/2-Alcatra/3-Picanha)");
		int op = input.nextInt();
		while(op<1 || op>3) {
			System.out.println("Op��o inv�lida. Insira novamente.\n(1-Fil� Duplo/2-Alcatra/3-Picanha)");
			op = input.nextInt();
			break;
		}
		
		System.out.println("Informe a quantidade comprada (em Kg)");
		double qtde = input.nextDouble();
		double precoKg=0;
		System.out.println("Possui cart�o Tabajara? (1-Sim/0-N�o)");
		int opCard = input.nextInt();
		while(opCard!=1 && opCard!=0) {
			System.out.println("Op��o inv�lida. Insira novamente.\n(1-Sim/0-N�o)");
			opCard = input.nextInt();
			break;
		}

		switch (op) {
		case 1: System.out.println("\nOp��o selecionada: Fil� Duplo\n");
			if(qtde<=5) {
				precoKg = 4.9;
			}else {
				precoKg = 5.8;
			}
			break;
		case 2: System.out.println("\nOp��o selecionada: Alcatra\n");
			if(qtde<=5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
			break;
		case 3: System.out.println("\nOp��o selecionada: Picanha\n");
			if(qtde<=5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
			break;
		default: break;
		}
		if(opCard == 1) {
			System.out.println("Quantidade comprada: "+qtde+" Kg\nPre�o por Kg: R$ "+precoKg);
			System.out.println("Pre�o total: R$ "+qtde*precoKg+"\nTipo de pagamento: Cart�o Tabajara");
			System.out.println("Desconto: 5%\nTotal � pagar: R$" +qtde*precoKg*0.95);
		} else {
			System.out.println("Quantidade comprada: "+qtde+" Kg\nPre�o por Kg: R$ "+precoKg);
			System.out.println("Pre�o total: R$ "+qtde*precoKg+"\nTipo de pagamento: Dinheiro/outro");
			System.out.println("Desconto: Sem desconto\nTotal � pagar: R$" +qtde*precoKg);
		}
	}
}

