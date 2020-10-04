package Aula46;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;
	
	public Triangulo() {}
	
	public Triangulo(String nome, double base, double altura) {
		super.setNome(nome);
		this.base = base;
		this.altura = altura;
	}
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura/2;
	}
	
	@Override
	public String toString() {
		String s = super.getNome()+"\n¡rea: "+calcularArea();
		return s;
	}

}
