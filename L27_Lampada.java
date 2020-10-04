package Aula27;

public class Lampada{
	String modelo;
	String tensao;
	double potencia;
	String tipoLuz;
	
	//A v�riavel status atribui o estado da lampada (on ou off)
	Boolean status;
	
	//Este m�todo liga a lampada
	void ligarLampada() {
		status = true;
	}
	
	//Este m�todo desliga a lampada
	void desligarLampada() {
		status = false;
	}

	// M�todo que verifica o estado da lampada
	//Importante notar que o atributo status � colocado diretamente sem o objeto
	void informarEstado () {
		if(status) {
			System.out.println("A l�mpada est� ligada");
		} else {
			System.out.println("A l�mpada est� desligada.");
		}
	}
	
	
	//� poss�vel colocar m�todos dentro de m�todos:
	void mudarEstado () {
		if(status) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}

}