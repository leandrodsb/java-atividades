package Aula43;

public class ContaEspecial extends ContaBancaria {
	private Double limite;
	private double saqueComLimite;
	
	public ContaEspecial() {}
	
	public ContaEspecial(Double limite) {
		this.limite = limite;
	}
	
	
	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public Boolean Sacar(double saque) {
		saqueComLimite = super.getSaldo() + limite;
		if(saqueComLimite>=saque) {
			this.setSaldo(super.getSaldo()-saque);
			return true;
		} 
		else{
			return false;
		}
	}
	
}
