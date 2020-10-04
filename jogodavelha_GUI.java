package JogoDaVelha;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame{
	
	JButton jb = new JButton("Play");
	
	
	public GUI () {
		setLayout(null);
		jb.setBounds(200, 100, 100, 50);
		add(jb);
		setTitle("Jogo da Velha");
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	

	public static void main(String[] args) {
		
		new GUI();
		
		Scanner scan = new Scanner(System.in);
		Jogo game = new Jogo();
		Jogador[] player = new Jogador[2];
	
		game.DefineJogadores();
	
		game.MostraJogo();
		
		while (!game.isVictory()) {
			if(game.getJogada()%2!=0) {
				game.setSinal('X');
				System.out.println("Vez de "+game.getPlayer()[0].getNome());
				System.out.println("Insira a posição (Linha/Coluna):\n ");
				game.Jogada();
			} else {
				game.setSinal('O');
				System.out.println("Vez de "+game.getPlayer()[1].getNome());
				System.out.println("Insira a posição (Linha/Coluna):\n ");
				game.Jogada();
			}
			game.MostraJogo();
			game.VerificaVitoria();
		}
	}
}
