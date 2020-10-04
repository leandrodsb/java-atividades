package Aula27;
import java.util.Scanner;

public class Aluno {
	String Nome;
	String Matricula;
	String Curso;
	String [] Disciplina = new String[3];
	double [] Nota = new double[3];
	boolean Erro;
	Scanner input = new Scanner(System.in);
	
	void VerificarNotas () {
		
		System.out.println("\nAluno: "+Nome);
		System.out.println("Matrícula: "+Matricula);
		System.out.println("Curso: "+Curso+"\n");
		
		for (int i=0 ; i<Nota.length; i++) {
			if(Nota[i]>=7) { 
				System.out.println("Disciplina: " +Disciplina[i]+ " - Nota: " + Nota[i] + " - Aprovado");
			} else {
				System.out.println("Disciplina: " +Disciplina[i]+ " - Nota: " + Nota[i] + " - Reprovado");
			}
		}
	}
	
	void Corrigir (int valor) {
		while(Erro) {
			System.out.println("Valor Inválido! Insira novamente.");
			Nota[valor] = input.nextDouble();
			if(Nota[valor]>=0 && Nota[valor]<=10) {
				Erro = false;
			}
		}
	}
		
		
}
