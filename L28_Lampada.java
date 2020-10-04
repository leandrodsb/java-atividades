package Aula28;

class Lampada{
	private String modelo;
	private String tensao;
	private double potencia;
	private String tipoLuz;
	private boolean Estado;
	

	String getModelo() {
		return modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	String getTensao() {
		return tensao;
	}

	void setTensao(String tensao) {
		this.tensao = tensao;
	}

	double getPotencia() {
		return potencia;
	}

	void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	String getTipoLuz() {
		return tipoLuz;
	}

	void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	
	Lampada(){
		System.out.println("Insira as características da lâmpada.");
		
	}
	
	void VerAtributos() {
		System.out.println(modelo);
		System.out.println(tensao);
		System.out.println(potencia);
		System.out.println(tipoLuz);
	}
	
	void LigarLampada() {
		Estado = true;
	}
	
	void DesligarLampada() {
		Estado = false;
	}
	
	void VerificarEstado() {
		if(Estado==true) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada.");
		}
		
	}
	
}