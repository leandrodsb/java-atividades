package Aula38.exer02;

public class PessoaJuridica extends Contribuinte {
	private Double RendaBrutaEmpresa;
	
	public Double getRendaBrutaEmpresa() {
		return RendaBrutaEmpresa;
	}

	public void setRendaBrutaEmpresa(Double rendaBrutaEmpresa) {
		RendaBrutaEmpresa = rendaBrutaEmpresa;
	}

	public double CalcularImposto(double RendaBrutaEmpresa) {
		super.setImposto(RendaBrutaEmpresa*0.9);
		return RendaBrutaEmpresa*0.9;
	}
}


