package Aula28;

import java.util.Scanner;

import Aula28.Aluno;

public class Exer03 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o seu nome:");
		aluno.setNome(input.nextLine());
		System.out.println("Digite sua matrícula:");
		aluno.setMatricula(input.nextLine());
		System.out.println("Digite seu curso:");
		aluno.setCurso(input.nextLine());
		
		for(int i = 0; i<aluno.getDisciplina().length; i++) {
			System.out.println("Entre com o nome da disciplina "+(i+1)+" :");
			aluno.definirDisciplina(i,input.nextLine());
		}
	
		for(int i = 0; i<aluno.getNota().length; i++) {
			System.out.println("Entre com a nota da disciplina "+aluno.getDisciplina()[i]+" :");
			for(int j = 0; j<aluno.getNota()[i].length; j++) {
				aluno.setErro(true);
				while(aluno.isErro()) {	
					System.out.print("Nota "+(j+1)+ " : ");
					aluno.definirNota(i, j, input.nextDouble());
				}	
			}	
		}	
		aluno.VerificarNotas();
	}
}


