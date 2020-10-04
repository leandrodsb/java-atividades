package Aula36;

public class Curso {
	private String nome;
	private String horario;
	private Professor prof;
	private Aluno[] alunos;
	
	public Curso() {}
	
	public Curso(String nome, String horario) {
		this.nome = nome;
		this.horario = horario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String MostrarAluno() {
		String info = "";
		if (alunos != null) {
			for (Aluno a : alunos) {
				info += "Nome: "+a.getNomeAluno()+ "\nMatrícula: "+a.getMatricula()+"\n";
			}
		}
		return info;
	}
	
	public String MostrarInfo () {
		String info = "Nome do curso: "+nome+"\nHorário: "+horario;
		if(prof != null) {
			info += prof.MostrarInfo();
		}
		if(alunos!=null) {
			for(Aluno auxAluno : alunos) {
				info += auxAluno.MostrarInfo();
			}
		}
		return info;
	}

	
	

}
