package Aula38.exer02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		PessoaFisica[] pessoaFisica = new PessoaFisica[3];
		for(int i = 0; i<pessoaFisica.length; i++) {
			input.nextLine();
			pessoaFisica[i] = new PessoaFisica();
			System.out.println("Entre com o nome da pessoa física:");
			pessoaFisica[i].setNome(input.nextLine());
			System.out.println("Entre com a renda bruta da pessoa física:");
			pessoaFisica[i].setRendaBruta(input.nextDouble());
		}
		PessoaJuridica[] pessoaJuridica = new PessoaJuridica[3];
		for(int i = 0; i<pessoaFisica.length; i++) {
			pessoaJuridica[i] = new PessoaJuridica();
			input.nextLine();
			System.out.println("Entre com o nome da empresa:");
			pessoaJuridica[i].setNome(input.nextLine());
			System.out.println("Entre com a renda bruta da empresa:");
			pessoaJuridica[i].setRendaBrutaEmpresa(input.nextDouble());
		}
		MostrarInfo(pessoaFisica,pessoaJuridica);
		
	}
	private static void MostrarInfo(PessoaFisica[] usuario, PessoaJuridica[] empresa) {
		System.out.println("\n-----Pessoa Física ----\n");
		for(int i =0; i<usuario.length; i++) {
			double renda = usuario[i].getRendaBruta();
			System.out.println(usuario[i].getNome()+" -- Renda líquida: R$ "+usuario[i].CalcularImposto(renda));
		}
		System.out.println("\n");
		System.out.println("\n-----Pessoa Jurídica ----\n");
		for(int i =0; i<empresa.length; i++) {
			double renda = empresa[i].getRendaBrutaEmpresa();
			System.out.println(empresa[i].getNome()+" -- Renda líquida: R$ "+empresa[i].CalcularImposto(renda));
		}
	}

}
