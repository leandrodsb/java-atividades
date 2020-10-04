package TestesConta;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	private double taxa;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void CalcularNovoSaldo(double taxa) {
		if(diaRendimento == 2) {
			super.setSaldo(getSaldo()*(1+taxa/100));
		} else {
			System.out.println("Não é dia de rendimento.");
		}
		
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "Novo saldo dia de rendimento: R$" +super.getSaldo();
		return s;
	}

}
