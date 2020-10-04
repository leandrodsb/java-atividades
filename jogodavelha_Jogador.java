package JogoDaVelha;


public class Jogador{
	
	private String nome;
	
	public Jogador() {}
	
	public Jogador(String nome, char sinal) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
