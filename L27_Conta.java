package Aula27;
import java.util.Scanner;

public class Conta {
	int numeroConta;
	double saldoConta = 1000000;
	double limiteConta;
	boolean statusConta = true, statusError;
	int  newOption;
	Scanner scan = new Scanner(System.in);
	
	void saque (double quant1) {
		if(saldoConta>=0 && quant1<=saldoConta) {
			saldoConta-=quant1;
			System.out.println("Saque de R$ "+quant1+ " realizado.\nSeu saldo atual: R$ "+saldoConta);
		} else {
			System.out.println("N�o h� saldo dispon�vel para realizar este saque\nSaldo atual:"+saldoConta);
		}
	}
	
	void deposito (double quant2) {
		saldoConta+=quant2;
		System.out.println("Dep�sito realizado!\nValor depositado: R$ "+quant2+"\n\nSaldo atual: R$ "+saldoConta);
	}
	void consultar() {
		System.out.println("Seu saldo atual: R$ " +saldoConta);
	}
	
	void verificarStatus() {
		if (statusConta == true) {
			System.out.println("Sua conta � especial.");
		} else {
			System.out.println("Sua conta n�o � especial.");
		}
	}
	
	boolean check (int op) {
		if(op<1 || op>4) {
			while(op<1 || op>4) {
				System.out.println("Op��o inv�lida! Repita o processo.");
				System.out.println("(1-Saque / 2-Dep�sito / 3-Consultar saldo / 4-Verificar status");
				op = scan.nextInt();
				if(op>=1 && op<=4) {
					newOption = op;
				}
			}
			return false;
		}else {
			return true;
		}
		
	}
}
