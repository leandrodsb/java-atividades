package TestesConta;

public class Teste {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		ContaPoupanca poupanca = new ContaPoupanca();
		conta.setNomeCliente("Leandro");
		conta.setNumConta("12345");
		conta.setSaldo(10500);
		
		ContaBancaria contaText [] = {conta, poupanca};
		
		for (ContaBancaria c : contaText) {
			System.out.println(c);
		}	
		
		poupanca.setDiaRendimento(2);
		
		conta.Sacar(12000);
		conta.Deposito(450);
		poupanca.CalcularNovoSaldo(2);
		
		

	}

}
