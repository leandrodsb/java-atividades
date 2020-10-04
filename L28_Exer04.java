package Aula28;

public class Exer04 {

	public static void main(String[] args) {
		JogoDaVelha game = new JogoDaVelha();
		System.out.println("Bem-vindo ao jogo da velha!");
		game.ShowGame();
		
		while(!game.isVictory()) {
			if(game.getJogada()%2!=0) {
				System.out.println("\nVez do jogador 1!\n");
				game.setSinal('X');
				
			} else {
				System.out.println("\nVez do jogador 2!\n");
				game.setSinal('O');
			}
			System.out.println("Insira a posição da jogada.");
			
			game.InputPos();
			game.ShowGame();
			game.CheckWinner();
		
		}
	}
}


