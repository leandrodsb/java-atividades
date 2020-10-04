package Aula38.exer01;

public class Aluno extends Pessoa{
	private String matricula;
	private double[] notas;
	
	public Aluno() {}
	
	public Aluno (String nome, String cpf, String matricula) {
		super.setNome(nome);
		super.setCpf(cpf);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void MostrarInfo() {
		System.out.println("\nDados do aluno:\nNome: "+super.getNome()+"\nMatrícula: "+matricula);
	}
	
	

}
