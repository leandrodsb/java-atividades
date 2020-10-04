package Exercicios;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private Double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String nomeCliente, String numConta, Double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar(double saque) {
		if (saque<=saldo){
			saldo-=saque;
			System.out.println("Saque de R$ "+saque+" realizado!\nSaldo atual: R$ "+saldo);
		} else {
			System.out.println("Não há saldo disponível para sacar o valor de R$ "+saque+" !\nSaldo atual: R$ "+saldo);
		}
	}
	
	public void deposito(double deposito) {
		if (deposito<0) {
			do {
				System.out.println("Valor inserido inválido! Insira novamente o valor de depósito. ");
			} while (deposito<0);
		}
		
		saldo += deposito;
		System.out.println("Depósito de R$ "+deposito+" realizado!\nSaldo atual: R$" +saldo);
	}
	
	

}
