package Aula46;

public class Circulo extends Figura2D {
	
	private double raio;
	
	public Circulo() {}
	
	public Circulo(String nome, double raio) {
		super.setNome(nome);
		this.raio = raio;
	}
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(raio, 2);
	}
	
	@Override
	public String toString() {
		String s = super.getNome()+"\n¡rea: "+calcularArea();
		return s;
	}
}

