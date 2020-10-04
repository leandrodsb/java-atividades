package JogoDaVelha;

import java.util.Scanner;

public class Jogo {
	
	private Jogador[] player;
	private char matriz[][] = new char[3][3];
	private int linha;
	private int coluna;
	private char sinal;
	private int jogada = 1;
	private boolean victory = false;

	public Jogador[] getPlayer() {
		return player;
	}

	public void setPlayer(Jogador[] player) {
		this.player = player;
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
	

	public char getSinal() {
		return sinal;
	}

	public void setSinal(char sinal) {
		this.sinal = sinal;
	}
	

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	
	public boolean isVictory() {
		return victory;
	}

	public void setVictory(boolean victory) {
		this.victory = victory;
	}

	public void DefineJogadores() {
		Scanner scan = new Scanner(System.in);
		Jogador[] player = new Jogador[2];
		for(int i=0; i<player.length; i++) {
			player[i] = new Jogador();
			System.out.println("Insira o nome do jogador "+(i+1)+": ");
			player[i].setNome(scan.nextLine());
			setPlayer(player);
		}
	}
	
	public void Jogada() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Linha: ");
		linha = scan.nextInt();
		while(linha<1 || linha>3) {
			System.out.println("\nValor inválido (linha). Insira novamente.\n");
			linha = scan.nextInt();
		}
		System.out.println("Coluna: ");
		coluna = scan.nextInt();
		while(coluna<1 || coluna>3) {
			System.out.println("\nValor inválido (coluna). Insira novamente.\n");
			linha = scan.nextInt();
		}
		matriz[linha-1][coluna-1] = sinal;
	}
	
	public void MostraJogo() {
		System.out.println("\n-------------------------");
		System.out.println("Jogador 1: "+player[0].getNome()+" [X]");
		System.out.println("Jogador 2: "+player[1].getNome()+" [O]");
		System.out.println("-------------------------\n");
		for(int i =0 ; i<matriz.length; i++) {
			System.out.print("L"+(i+1)+":  ");
			for(int j =0 ; j<matriz[i].length;j++) {
				System.out.print("|"+matriz[i][j]+"|");
			}
			System.out.println("\n");
		}
	}
	
	public void VerificaVitoria() {
		if((matriz[0][0] == 'X' && matriz[0][1] == 'X' && matriz[0][2] == 'X') ||
			(matriz[1][0] == 'X' && matriz[1][1] == 'X' && matriz[1][2] == 'X')||
			(matriz[2][0] == 'X' && matriz[2][1] == 'X' && matriz[2][2] == 'X')){
			System.out.println("Vitória!\n"+player[0].getNome()+" venceu!");
			victory = true;
		
		} else if((matriz[0][0] == 'O' && matriz[0][1] == 'O' && matriz[0][2] == 'O') ||
			(matriz[1][0] == 'O' && matriz[1][1] == 'O' && matriz[1][2] == 'O')||
			(matriz[2][0] == 'O' && matriz[2][1] == 'O' && matriz[2][2] == 'O')) {
			System.out.println("Vitória!\n"+player[1].getNome()+" venceu!");
			victory = true;
			
			
		} else if((matriz[0][0] == 'X' && matriz[1][0] == 'X' && matriz[2][0] == 'X') ||
				(matriz[0][1] == 'X' && matriz[1][1] == 'X' && matriz[2][1] == 'X')||
				(matriz[0][2] == 'X' && matriz[1][2] == 'X' && matriz[2][2] == 'X')) {
			System.out.println("Vitória!\n"+player[0].getNome()+" venceu!");
			victory = true;
			
		} else if((matriz[0][0] == 'O' && matriz[1][0] == 'O' && matriz[2][0] == 'O') ||
				(matriz[0][1] == 'O' && matriz[1][1] == 'O' && matriz[2][1] == 'O')||
				(matriz[0][2] == 'O' && matriz[1][2] == 'O' && matriz[2][2] == 'O')) {
			System.out.println("Vitória!\n"+player[1].getNome()+" venceu!");
			victory = true;
		
		} else if((matriz[0][0] == 'X' && matriz[1][1] == 'X' && matriz[2][2] == 'X') ||
				(matriz[0][2] == 'X' && matriz[1][1] == 'X' && matriz[2][0] == 'X')) {
			System.out.println("Vitória!\n"+player[0].getNome()+" venceu!");
			victory = true;
		} else if((matriz[0][0] == 'O' && matriz[1][1] == 'O' && matriz[2][2] == 'O') ||
				(matriz[0][2] == 'O' && matriz[1][1] == 'O' && matriz[2][0] == 'O')) {
			System.out.println("Vitória!\n"+player[1].getNome()+" venceu!");
			victory = true;
		}
		jogada++;
	}
	
}
