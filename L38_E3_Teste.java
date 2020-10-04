package Aula38.exer03;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Camelo", 1.5 , 4 ,"Amarelo", "Terra", 2.0);
		Peixe tubarao = new Peixe("Tubarão", 3 , 0 ,"Cinzento", "Mar", 1.5, "Barbatanas e cauda");
		Mamifero ursoCanada = new Mamifero("Urso do Canadá", 1.8 , 4 ,"Vermelho", "Terra", 0.5, "Mel");
		Animal[] animais = {camelo, tubarao, ursoCanada};
		for(Animal a : animais) {
			System.out.println(a.toString());
		}
		
		//Outra maneira:
		/*System.out.println(camelo.toString());
		System.out.println(tubarao.toString());
		System.out.println(ursoCanada.toString());*/
	}

}
