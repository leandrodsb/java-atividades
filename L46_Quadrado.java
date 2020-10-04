package Aula46;

public class Quadrado extends Figura2D {
	private double lado;
		
	public Quadrado() {}
	
	public Quadrado(String nome , double lado) {
		super.setNome(nome);
		this.lado = lado;
	}

	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);	
	}
	
	@Override
	public String toString() {
		String s = super.getNome()+"\n¡rea: "+calcularArea();
		return s;
	}
	
	

}
