package Aula36;

public class Professor {
	private String nomeProf;
	private String depart;
	private String email;
	
	public String getNomeProf() {
		return nomeProf;
	}
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String MostrarInfo() {
		String info = "Nome do Professor: "+nomeProf;
		return info;
	}
	

}
