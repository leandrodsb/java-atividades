package Aula38.exer02;

public class PessoaFisica extends Contribuinte{
	private Double RendaBruta;
	
	
	public Double getRendaBruta() {
		return RendaBruta;
	}

	public void setRendaBruta(Double rendaBruta) {
		RendaBruta = rendaBruta;
	}

	public double CalcularImposto(double RendaBruta) {
		if(RendaBruta>=0 && RendaBruta<=1400) {
			super.setImposto(RendaBruta*1);
		} else if(RendaBruta<=2100) {
			super.setImposto(RendaBruta*0.9);
		} else if(RendaBruta<=2800) {
			super.setImposto(RendaBruta*0.85);
		} else if(RendaBruta<=3600) {
			super.setImposto(RendaBruta*0.75);
		} else {
			super.setImposto(RendaBruta*0.7);
		}
		
		return super.getImposto();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
