package Aula36;

public class Agenda {
	
	private String nome;
	private Contato[] contatosAgenda;

	public Agenda(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatosAgenda() {
		return contatosAgenda;
	}

	public void setContatosAgenda(Contato[] contatosAgenda) {
		this.contatosAgenda = contatosAgenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String ObterInfo() {
		String info = "Nome da agenda: "+nome+"\n\n";
		if(contatosAgenda!=null) {
			for ( Contato c : contatosAgenda) {
				info += c.ObterInfo() + "\n";
			}
		}
		
		return info;
	}
	
}
