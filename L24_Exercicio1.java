package Aula24;

public class Exercicio1{ 

	public static void main(String[] args){
		Lampada lamp = new Lampada();
		lamp.modelo = "A60";
		lamp.tensão = "Bivolt";
		lamp.potencia = 7;
		lamp.cor = "Amarela";
		lamp.tipos = new String[3];
		lamp.tipos [0] = "Abajur";
		lamp.tipos [1] = "Lamparina";
		lamp.tipos [2] = "Escritório";
		
		System.out.println(lamp.modelo);
		System.out.println(lamp.tensão);
		System.out.println(lamp.potencia);
		System.out.println(lamp.cor);
		for(String tipo : lamp.tipos) {
			System.out.print(tipo+" ");
		}
	}
}