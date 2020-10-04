package Aula43;

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
	
	public Boolean Sacar(double saque) {
		if(saque<=saldo) {
			saldo-=saque;
			return true;
		} else {
			return false;
		}
	}
	
	public void Depositar(double deposito) {
		saldo+=deposito;
	}
	
}
