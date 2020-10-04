package TestesConta;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Sacar(double saque) {
		if(saldo>=saque) {
			saldo-=saque;
			System.out.println("Saque de R$"+saque+" realizado!\nSaldo atual: R$" +saldo);
		} else {
			System.out.println("N�o h� saldo suficiente para realizar a opera��o (Saque).\nSaldo atual: R$" +saldo);
		}
	}
	
	public void Deposito (double deposito) {
		saldo+=deposito;
		System.out.println("Dep�sito de R$"+deposito+" realizado!\nSaldo atual: R$" +saldo);
	}
	
	@Override
	public String toString() {
		String s = "\nNome do Cliente: "+nomeCliente+"\nN�mero da Conta: "+numConta+"\n";
		return s;
	}
	
}
