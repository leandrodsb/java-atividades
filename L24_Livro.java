package Aula24;

public class Livro {
	String title;
	
	int identificar() {
		int cod=0;
		String[] titulo = new String [5];
		titulo [0] = "Pai rico, Pai pobre";
		titulo [1] = "Milagre da manh�";
		titulo [2] = "C�lculo 4";
		titulo [3] = "B�blia Sagrada";
		titulo [4] = "A hist�ria do Brasil";
		for(int i = 0; i<titulo.length;i++ ) {
			if(title.equalsIgnoreCase(titulo[i])) {
				cod = i;
				break;
			}
		}
		return cod;
	}
	
	void searchBook() {
		switch(identificar()) {
		case 0:
			System.out.println("T�tulo:  Pai rico, Pai pobre");
			System.out.println("Autor: KIYOSAKI, Robert");
			System.out.println("Data de lan�amento: 2015");
			System.out.println("N�mero de ID: 23547");
			System.out.println("Pa�s: Brasil");
			System.out.println("Idioma: Portugu�s");
			System.out.println("N�mero de p�ginas: 210");	
			break;
		case 1:
			System.out.println("T�tulo:  Milagre da Manh�");
			System.out.println("Autor: ELROD, Hal");
			System.out.println("Data de lan�amento: 2016");
			System.out.println("N�mero de ID: 56715");
			System.out.println("Pa�s: Brasil");
			System.out.println("Idioma: Portugu�s");
			System.out.println("N�mero de p�ginas: 196");	
			break;
		case 2:
			System.out.println("T�tulo: C�lculo 4");
			System.out.println("Autor: STEWART, James");
			System.out.println("Data de lan�amento: 2019");
			System.out.println("N�mero de ID: 5641");
			System.out.println("Pa�s: Brasil");
			System.out.println("Idioma: Portugu�s");
			System.out.println("N�mero de p�ginas: 452");	
			break;
		case 3:
			System.out.println("T�tulo:  B�blia Sagrada");
			System.out.println("Autor: Livraria S�o Pedro");
			System.out.println("Data de lan�amento: 1998");
			System.out.println("N�mero de ID: 13485");
			System.out.println("Pa�s: Brasil");
			System.out.println("Idioma: Portugu�s");
			System.out.println("N�mero de p�ginas: 821");	
			break;
		case 4:
			System.out.println("T�tulo:  A Hist�ria do Brasil");
			System.out.println("Autor: Dom Pedro II");
			System.out.println("Data de lan�amento: 1875");
			System.out.println("N�mero de ID: 132");
			System.out.println("Pa�s: Brasil");
			System.out.println("Idioma: Portugu�s");
			System.out.println("N�mero de p�ginas: 185");
			break;
		default: break;
		
			
		
		
		}	
	}
		
}



