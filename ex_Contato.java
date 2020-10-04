package Testes;

public class Contato {
	
	private String nomeContato;
	private String endereco;
	private String email;
	
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String MostrarInfo() {
		String info = "\nNome: "+nomeContato+"\nEndereço: "+endereco+"\nE-mail: "+email+"\n\n";
		return info;
	}

}
