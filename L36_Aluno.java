package Aula36;

public class Aluno {
	private String nomeAluno;
	private String matricula;
	private Double[] notas;
	
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double[] getNotas() {
		return notas;
	}
	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	
	public String MostrarInfo() {
		Double Soma = 0.0;
		String info = "\nNome do aluno: "+nomeAluno+"\nMatrícula: "+matricula+"\n";
		info+="Notas: ";
		for (double nota : notas) {
			info += nota+" ";
			Soma += nota; 
		}
		Double media = Soma/4;
		if(media>=7) {
			info+="Média: "+media+"\n\nAprovado!";
			return info;
		} else {
			info+="Média: "+media+"\n\nReprovado!\n";
			return info;
		}
	}
}
