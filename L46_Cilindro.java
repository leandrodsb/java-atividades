package Aula46;

public class Cilindro extends Figura3D{

	private double raio;
	private double altura;
	
	
	public Cilindro() {}
	
	
	public Cilindro(String nome, double raio, double altura) {
		super.setNome(nome);
		this.raio = raio;
		this.altura = altura;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public double calcularArea() {
		return 2*(Math.PI*Math.pow(raio, 2)+Math.PI*raio*altura);
	}

	@Override
	public double calcularVolume() {
		return Math.PI*Math.pow(raio, 2)*altura;
	}
	
	@Override
	public String toString() {
		String s = super.getNome()+"\n¡rea total: "+calcularArea();
		s += "\nVolume: "+calcularVolume();
		return s;
	}

}
