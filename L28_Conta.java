package Aula28;

class Conta {
	private String NumConta;
	private double Saldo;
	private boolean Especial;
	private double LimiteConta;
	private boolean replay;
	
	public Conta() {}
	
	public Conta(String numConta, double saldo, boolean especial, double limiteConta) {
		this.NumConta = numConta;
		this.Saldo = saldo;
		this.Especial = especial;
		this.LimiteConta = limiteConta;
	}
	

	public void setNumConta(String NumConta) {
		this.NumConta=NumConta;
	}
	
	public String getNumConta(){
		return NumConta;
	}
	
	public void setSaldo(double Saldo) {
		this.Saldo=Saldo;
	}
	
	public double getSaldo(){
		return Saldo;
	}
	
	public void setEspecial(boolean Especial) {
		this.Especial=Especial;
	}
	
	public boolean getEspecial(){
		return Especial;
	}
	
	public void setLimiteConta(double LimiteConta) {
		this.LimiteConta=LimiteConta;
	}
	
	public double getLimiteConta(){
		return LimiteConta;
	}

	void Saque(double Saque) {
		if(this.Saldo>=Saque) {
			this.Saldo-=Saque;
			System.out.println("Saque de R$ "+Saque+" realizado!");
		} else {
			System.out.println("N�o h� saldo suficiente para realizar esta opera��o.");
		}
	}
	
	void Dep�sito(double Deposito) {
		if((Deposito+Saldo)<=LimiteConta) {
			Saldo+=Deposito;
			System.out.println("Dep�sito de R$ "+Deposito+" realizado!");
		} else {
			System.out.println("Limite da conta ultrapassado");
		}
	}
	
	void Consultar() {
		System.out.println("Seu saldo � de: R$ "+Saldo);
	}
	
	void VerificarEspecial() {
		if(this.Especial) {
			System.out.print("Est� Utilizando especial.\n");
		}else {
			System.out.print("N�o est� utilizando especial.\n");
		}
	}
	
}
