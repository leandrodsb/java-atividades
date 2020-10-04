package Aula28;

import java.util.Scanner;

public class Aluno {
	private String Nome;
	private String Matricula;
	private String Curso;
	private String [] Disciplina = new String[3];
	private double [][] Nota = new double[3][4];
	private boolean Erro=true;
	private double Soma;
	private Scanner input = new Scanner(System.in);

	
	public Aluno() {}
	
	public Aluno(String nome, String matricula, String curso, String[] disciplina) {
		this.Nome = nome;
		this.Matricula = matricula;
		this.Curso = curso;
		this.Disciplina = disciplina;
	}
	
	public void setErro (boolean Erro) {
		this.Erro = Erro;
	}
	
	public boolean isErro() {
		return Erro;
	}
	
	public String getNome() {
		return Nome;
	}
	

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		this.Curso = curso;
	}

	public String[] getDisciplina() {
		return Disciplina;
	}	

	public void setDisciplina(String[] disciplina) {
		this.Disciplina = disciplina;
	}

	public double[][] getNota() {
		return Nota;
	}

	public void setNota(double[][] nota) {
		this.Nota = nota;
	}

	
	public void definirDisciplina (int pos, String nome) {
		Disciplina[pos] = nome;	
	}
	
	public void definirNota (int linha, int coluna, double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Valor Inválido! Insira novamente.");
			Erro = true;
		} else {
			this.Nota[linha][coluna] = nota;
			Erro = false;
		}
	}
	
	public String MostrarDisciplina(int valor) {
		return Disciplina[valor];
	}
	
	void VerificarNotas () {
		
		System.out.println("\nAluno: "+Nome);
		System.out.println("Matrícula: "+Matricula);
		System.out.println("Curso: "+Curso+"\n");
		
		for(int i = 0 ; i<Nota.length ; i++) {
			System.out.print(Disciplina[i]+": ");
			Soma = 0;
			for(int j = 0 ; j<Nota[i].length ; j++) {
				System.out.print(Nota[i][j]+" ");
				Soma += Nota[i][j];
			}
			if((Soma/4)>=7) {
				System.out.print(" Média: " +Soma/4+ " - Aprovado");
			} else {
				System.out.print(" Média: " +Soma/4+ " - Reprovado");
			}
			System.out.println();
		}
	}
}


