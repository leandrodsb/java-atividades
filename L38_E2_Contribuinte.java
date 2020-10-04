package Aula38.exer02;

public abstract class Contribuinte {
	private String nome;
	private Double imposto;

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double CalcularImposto(double valor);
	

}
