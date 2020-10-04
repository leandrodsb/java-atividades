package Testes;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contato;
	
	public Agenda() {}
	
	public Agenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	
	public String MostrarInfo() {
		String info = "Nome da agenda: "+nomeAgenda+"\n";
		if(contato != null) {
			for(Contato cont : contato) {
				info += cont.MostrarInfo();
			}
		}
		return info;
	}
	
}
