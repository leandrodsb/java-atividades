package Aula27;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta conta = new Conta();
		boolean replay = true;
		
		while(replay) {
			System.out.println("Selecione a operação a ser realizada:");
			System.out.println("(1-Saque / 2-Depósito / 3-Consultar saldo / 4-Verificar status");
			int option = input.nextInt();
			
			if(conta.check(option)==false) {
				option = conta.newOption;
			}
			
			switch(option) {
			case 1: 
				System.out.println("Insira o valor de saque.");
				double valorSaque = input.nextDouble();
				conta.saque(valorSaque);
				break;
			case 2:
				System.out.println("Insira o valor de depósito.");
				double valorDeposito = input.nextDouble();
				conta.deposito(valorDeposito);
				break;
			case 3:
				conta.consultar();
				break;
			case 4:
				conta.verificarStatus();
				break;
			default: break; 
			}
			System.out.println("Deseja realizar outra operação?");
			replay = input.nextBoolean();
		}
		System.out.println("\nProcesso finalizado! Muito obrigado!");

	}

}
