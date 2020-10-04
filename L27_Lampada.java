package Aula27;

public class Lampada{
	String modelo;
	String tensao;
	double potencia;
	String tipoLuz;
	
	//A váriavel status atribui o estado da lampada (on ou off)
	Boolean status;
	
	//Este método liga a lampada
	void ligarLampada() {
		status = true;
	}
	
	//Este método desliga a lampada
	void desligarLampada() {
		status = false;
	}

	// Método que verifica o estado da lampada
	//Importante notar que o atributo status é colocado diretamente sem o objeto
	void informarEstado () {
		if(status) {
			System.out.println("A lâmpada está ligada");
		} else {
			System.out.println("A lâmpada está desligada.");
		}
	}
	
	
	//É possível colocar métodos dentro de métodos:
	void mudarEstado () {
		if(status) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}

}