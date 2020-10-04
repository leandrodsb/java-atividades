package Aula28;

import java.util.Scanner;

public class JogoDaVelha {
	private Scanner input = new Scanner(System.in);
	private int linha, coluna, jogada=1;
	private char Jogo[][] = new char[3][3], sinal;
	private boolean CheckPos1,CheckPos2, CheckPos3;
	private boolean Victory = false;
	
	public JogoDaVelha() {}
	
	public JogoDaVelha(int linha, int coluna, int jogada,  char sinal) {
		this.linha = linha;
		this.coluna = coluna;
		this.jogada = jogada;
		this.sinal = sinal;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	public char[][] getJogo() {
		return Jogo;
	}

	public void setJogo(char[][] jogo) {
		Jogo = jogo;
	}

	public char getSinal() {
		return sinal;
	}

	public void setSinal(char sinal) {
		this.sinal = sinal;
	}

	public boolean isVictory() {
		return Victory;
	}

	public void setVictory(boolean victory) {
		Victory = victory;
	}

	private void Reset() {
		CheckPos1 = false;
		CheckPos2= false;
		CheckPos3= false;
	}
	
	public void InputPos() {
		do {
			Reset();
			while(!CheckPos1) {
				System.out.println("Linha:");
				linha = input.nextInt();;
				if (linha<1 || linha>3) {
					System.out.println("Posição inválida. Insira novamente.");
					CheckPos1 = false;
					
				} else {
					CheckPos1 = true;
				}
			}
			while(!CheckPos2) {
				System.out.println("Coluna:");
				coluna = input.nextInt();
				if (coluna<1 || coluna>3) {
					System.out.println("Posição inválida. Insira novamente.");
					CheckPos2 = false;
				} else {
					CheckPos2 = true;
				}
			}
			linha--;
			coluna --;	
			if(Jogo[linha][coluna] == 'X' || Jogo[linha][coluna] == 'O' ) {
				System.out.println("Posição já utilizada. Insira novamente.");
				CheckPos3 = false;
			} else {
				CheckPos3 = true;
				Jogo[linha][coluna] = sinal;
				jogada++;
			}
		} while(!CheckPos3);
	}
	
	public void ShowGame () {
		for(int i = 0 ; i<Jogo.length; i++) {
			for (int j = 0 ;j<Jogo[i].length; j++) {
				System.out.print(Jogo[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	public void CheckWinner() {
		if((Jogo[0][0] == 'X' && Jogo[0][1] == 'X' && Jogo [0][2]== 'X') ||
			(Jogo[1][0] == 'X' && Jogo[1][1] == 'X' && Jogo [1][2]== 'X')||
			(Jogo[2][0] == 'X' && Jogo[2][1] == 'X' && Jogo [2][2]== 'X')) {
			
			System.out.println("\nJogador 1 venceu!");
			Victory = true;
			
		} else if((Jogo[0][0] == 'O' && Jogo[0][1] == 'O' && Jogo [0][2]== 'O') ||
			(Jogo[1][0] == 'O' && Jogo[1][1] == 'O' && Jogo [1][2]== 'O')||
			(Jogo[2][0] == 'O' && Jogo[2][1] == 'O' && Jogo [2][2]== 'O')) {
			
			System.out.println("\nJogador 2 venceu!");
			Victory = true;
			
		}
		if((Jogo[0][0] == 'X' && Jogo[1][0] == 'X' && Jogo [2][0]== 'X') ||
			(Jogo[0][1] == 'X' && Jogo[1][1] == 'X' && Jogo [2][1]== 'X')||
			(Jogo[0][2] == 'X' && Jogo[1][2] == 'X' && Jogo [2][2]== 'X')) {
			
			System.out.println("\nJogador 1 venceu!");
			Victory = true;
			
			
		} else if((Jogo[0][0] == 'O' && Jogo[1][0] == 'O' && Jogo [2][0]== 'O') ||
			(Jogo[0][1] == 'O' && Jogo[1][1] == 'O' && Jogo [2][1]== 'O')||
			(Jogo[0][2] == 'O' && Jogo[1][2] == 'O' && Jogo [2][2]== 'O')) {
			
			System.out.println("\nJogador 2 venceu!");
			Victory = true;
			
			
		}
		
		if((Jogo[0][0] == 'X' && Jogo[1][1] == 'X' && Jogo[2][2] == 'X') || 
			(Jogo[0][2] == 'X' && Jogo[1][1] == 'X' && Jogo[2][0] == 'X')) {
			
			System.out.println("\nJogador 1 venceu!");
			Victory = true;
			
		} else if((Jogo[0][0] == 'O' && Jogo[1][1] == 'O' && Jogo[2][2] == 'O') || 
				(Jogo[0][2] == 'O' && Jogo[1][1] == 'O' && Jogo[2][0] == 'O')){
			
			System.out.println("\nJogador 2 venceu!");
			Victory = true;
			
		}
		
		if (jogada > 9) {
			System.out.println("\nFim de jogo! Não houve vencedores.");
			Victory = true;
		}
	}
}

