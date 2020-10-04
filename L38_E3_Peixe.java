package Aula38.exer03;

public class Peixe extends Animal{
	private String caracteristicas;
	
	public Peixe() {}
	
	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristicas) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += super.toString() + "\nCaracterísticas: "+caracteristicas;
		return s;
	}
}
