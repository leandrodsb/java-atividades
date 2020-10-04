package Aula20;
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		char Jogo[][] = new char[3][3];
		int jogada=1;
		char sinal;
		int linha = 0, coluna = 0;
		boolean EndGame=false;
		

 		while(!EndGame) {
 			boolean LinhaError=false, ColunaError = false;
 			
 			System.out.println("\nJogador 1 (X) / Jogador 2 (O)\n");
 			
 			for(int i = 0; i<Jogo.length; i++) {
 				for(int j = 0; j<Jogo[i].length; j++) {
 					System.out.print(Jogo[i][j]+"|");
 				}
 				System.out.println();
 			}
 			
 			if(jogada%2!=0) {
 				System.out.println("Vez do jogador 1!\n");
 				sinal = 'X';
 			} else {
 				System.out.println("Vez do jogador 2!\n");
 				sinal = 'O';
 			}

 			while(!LinhaError) {
 				System.out.println("\nLinha:");
 	 			linha = input.nextInt();
			 	if(linha>=1 && linha<=3){
			 		LinhaError = true;
			 				
			 	} else  {
			 		System.out.println("Valor inválido. Insira novamente.");
			 		linha = input.nextInt();
			 		LinhaError = false;
			 	}
 			}
			 while(!ColunaError) {	
				 System.out.println("Coluna:");
		 		coluna = input.nextInt();
		 		if(coluna>=1 && coluna<=3) {
		 			ColunaError = true;
		 				
		 		}else {
		 			System.out.println("Valor inválido. Insira novamente.");
		 			coluna = input.nextInt();
			 		ColunaError = false;
	 			}		 				
			 }
			 if(Jogo[linha-1][coluna-1] == 'X' || Jogo[linha-1][coluna-1]=='O') {
		 		System.out.println("Posição já usada. Tente novamente.");
		 	} else {
		 		Jogo[linha-1][coluna-1] = sinal;
		 		jogada++;
		 	}
	 			
	 		
 			for(int i = 0; i<Jogo.length; i++) {
 		
		 		if( (Jogo[i][0]== 'X' && Jogo[i][1] == 'X' && Jogo[i][2] == 'X') || (Jogo[i][0]== 'O' && Jogo[i][1] == 'O' && Jogo[i][2] == 'O')){
		 			switch(Jogo[i][0]){
		 			case 'X':
		 				System.out.println("\nVitória!\nJogador 1 venceu.\n"); break;
		 			case 'O':	
		 				System.out.println("\nVitória!\nJogador 2 venceu.\n"); break;
		 			default: break;
		 			}
		 			EndGame=true;
		 			
		 		} else if( (Jogo[0][i]== 'X' && Jogo[1][i] == 'X' && Jogo[2][i] == 'X') || (Jogo[0][i]== 'O' && Jogo[1][i] == 'O' && Jogo[2][i] == 'O')) {
		 			switch(Jogo[0][i]){
		 			case 'X':
		 				System.out.println("\nVitória!\nJogador 1 venceu.\n"); break;
		 			case 'O':	
		 				System.out.println("\nVitória!\nJogador 2 venceu.\n"); break;
		 			default: break;
		 			}
		 			EndGame=true;
		 		} else if ( (Jogo[0][0]== 'X' && Jogo[1][1] == 'X' && Jogo[2][2] == 'X') || (Jogo[0][0]== 'O' && Jogo[1][1] == 'O' && Jogo[2][2] == 'O')) {
		 			switch(Jogo[1][1]){
		 			case 'X':
		 				System.out.println("\nVitória!\nJogador 1 venceu.\n"); break;
		 			case 'O':	
		 				System.out.println("\nVitória!\nJogador 2 venceu.\n"); break;
		 			default: break;
		 			}
		 			EndGame=true;
		 		} else if ( (Jogo[0][2]== 'X' && Jogo[1][1] == 'X' && Jogo[2][0] == 'X') || (Jogo[0][2]== 'O' && Jogo[1][1] == 'O' && Jogo[2][0] == 'O')) {
		 			switch(Jogo[1][1]){
		 			case 'X':
		 				System.out.println("\nVitória!\nJogador 1 venceu.\n"); break;
		 			case 'O':	
		 				System.out.println("\nVitória!\nJogador 2 venceu.\n"); break;
		 			default: break;
		 			}
		 			EndGame=true;
		 		} else if (jogada > 9) {
		 			System.out.println("Ninguém ganhou a partida");
		 			EndGame=true;
		 		}
 			}	
 				
	 	}		
 	}
}
