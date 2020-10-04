package Aula43;

public class ContaPoupanca extends ContaBancaria{
	private Double diaRendimento;

	public ContaPoupanca() {}
	
	public ContaPoupanca(Double rendimento) {
		this.setDiaRendimento(rendimento);
	}

	public Double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(Double diaRendimento) {
		this.diaRendimento = (1+diaRendimento/100);
	}
	
	
	public void CalcularNovoSaldo() {
		Double novoSaldo = super.getSaldo()*this.diaRendimento;
		super.setSaldo(novoSaldo);
	}

}
