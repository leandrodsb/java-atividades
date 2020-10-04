package Exercicios;

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria ("Leandro", "123456" , 25000.0);
		
		conta.setNomeCliente("Niko Bellic");
		System.out.println(conta.getNomeCliente());

	}

}
