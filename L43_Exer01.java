package Aula43;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ContaBancaria conta1 = new ContaBancaria("Leandro", "12345", 100.0);
		ContaBancaria poupanca= new ContaPoupanca(5.0);
		ContaEspecial especial1 = new ContaEspecial();
		especial1.setLimite(100.0);
		

		
		RealizarSaque(especial1,200.0);
		
		
	}
	
	private static void RealizarSaque(ContaBancaria conta, Double saque) {
		if(conta.Sacar(saque)) {
			System.out.println("Saque de R$ "+saque+" realizado!");
		} else {
			System.out.println("Saldo indisponível para realizar operação!");
		}
	}
	
	private static void RealizarDeposito(ContaBancaria conta, Double deposito) {
		conta.Depositar(deposito);
		System.out.println("Depósito de R$ "+deposito+" realizado!");
	}

}
