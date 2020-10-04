package Aula38.exer03;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero() {}

	public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += super.toString() + "\nAlimento: "+alimento;
		return s;
	}

}
