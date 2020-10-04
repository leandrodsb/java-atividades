package Aula46;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

	private double base;
	private double alturaBase;
	private double alturaPiramide;
	
	public Piramide() {}
	
	public Piramide(String nome, double base, double alturaBase, double alturaPiramide) {
		super.setNome(nome);
		this.base = base;
		this.alturaBase = alturaBase;
		this.alturaPiramide = alturaPiramide;
	}
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAlturaBase() {
		return alturaBase;
	}

	public void setAlturaBase(double alturaBase) {
		this.alturaBase = alturaBase;
	}

	public double getAlturaPiramide() {
		return alturaPiramide;
	}

	public void setAlturaPiramide(double alturaPiramide) {
		this.alturaPiramide = alturaPiramide;
	}

	@Override
	public double calcularVolume() {
		return calcularArea()*alturaPiramide/3;
	}

	@Override
	public double calcularArea() {
		return base*alturaBase/2;
	}
	
	@Override
	public String toString() {
		String s = super.getNome()+"\n¡rea da base: "+calcularArea();
		s += "\nVolume: "+calcularVolume();
		return s;
	}

}
