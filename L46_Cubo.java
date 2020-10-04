package Aula46;

public class Cubo extends Figura3D {
	
	private double lado;
	
	public Cubo() {}
	
	public Cubo(String nome, double lado) {
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
		return  6*Math.pow(lado, 2);
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
	
	@Override
	public String toString() {
		String s = super.getNome()+"\n¡rea: "+calcularArea();
		s += "\nVolume: "+calcularVolume();
		return s;
		
	}

}
