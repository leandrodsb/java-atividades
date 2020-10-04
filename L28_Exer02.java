package Aula28;

import java.util.Scanner;

public class Exer02 {
	
	public static void main (String[] args) {
		Conta conta = new Conta();
		
		conta.setNumConta("123456");
		conta.setSaldo(32000);
		conta.setEspecial(false);
		conta.setLimiteConta(100000);
		
		conta.Saque(1000);
		conta.Depósito(500);
		conta.Consultar();
		conta.VerificarEspecial();
	
	}
}
