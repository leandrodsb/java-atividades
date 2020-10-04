package Aula24;

public class Livro {
	String title;
	
	int identificar() {
		int cod=0;
		String[] titulo = new String [5];
		titulo [0] = "Pai rico, Pai pobre";
		titulo [1] = "Milagre da manhã";
		titulo [2] = "Cálculo 4";
		titulo [3] = "Bíblia Sagrada";
		titulo [4] = "A história do Brasil";
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
			System.out.println("Título:  Pai rico, Pai pobre");
			System.out.println("Autor: KIYOSAKI, Robert");
			System.out.println("Data de lançamento: 2015");
			System.out.println("Número de ID: 23547");
			System.out.println("País: Brasil");
			System.out.println("Idioma: Português");
			System.out.println("Número de páginas: 210");	
			break;
		case 1:
			System.out.println("Título:  Milagre da Manhã");
			System.out.println("Autor: ELROD, Hal");
			System.out.println("Data de lançamento: 2016");
			System.out.println("Número de ID: 56715");
			System.out.println("País: Brasil");
			System.out.println("Idioma: Português");
			System.out.println("Número de páginas: 196");	
			break;
		case 2:
			System.out.println("Título: Cálculo 4");
			System.out.println("Autor: STEWART, James");
			System.out.println("Data de lançamento: 2019");
			System.out.println("Número de ID: 5641");
			System.out.println("País: Brasil");
			System.out.println("Idioma: Português");
			System.out.println("Número de páginas: 452");	
			break;
		case 3:
			System.out.println("Título:  Bíblia Sagrada");
			System.out.println("Autor: Livraria São Pedro");
			System.out.println("Data de lançamento: 1998");
			System.out.println("Número de ID: 13485");
			System.out.println("País: Brasil");
			System.out.println("Idioma: Português");
			System.out.println("Número de páginas: 821");	
			break;
		case 4:
			System.out.println("Título:  A História do Brasil");
			System.out.println("Autor: Dom Pedro II");
			System.out.println("Data de lançamento: 1875");
			System.out.println("Número de ID: 132");
			System.out.println("País: Brasil");
			System.out.println("Idioma: Português");
			System.out.println("Número de páginas: 185");
			break;
		default: break;
		
			
		
		
		}	
	}
		
}



