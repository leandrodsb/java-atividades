package Aula27;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogo game = new Jogo();
		System.out.println("Bem-vindo ao jogo da velha!");
		game.ShowGame();
		
		while(!game.Victory) {
			if(game.jogada%2!=0) {
				System.out.println("\nVez do jogador 1!\n");
				game.sinal = 'X';
				
			} else {
				System.out.println("\nVez do jogador 2!\n");
				game.sinal = 'O';
			}
			System.out.println("Insira a posição da jogada.");
			
			game.InputPos();
			game.ShowGame();
			game.CheckWinner();
		
		}
	}
}
