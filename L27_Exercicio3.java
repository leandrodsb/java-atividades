package Aula27;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Insira o nome do aluno:");
		aluno.Nome = input.nextLine();
		System.out.println("Insira a matrícula do aluno:");
		aluno.Matricula = input.nextLine();
		System.out.println("Insira o curso do aluno:");
		aluno.Curso = input.nextLine();
		
		for(int i = 0; i<aluno.Disciplina.length; i++) {
			System.out.println("Entre com o nome da disciplina "+(i+1)+" :");
			aluno.Disciplina[i] = input.nextLine();
			
		}	
		for(int i = 0; i<aluno.Nota.length; i++) {
			System.out.println("Entre com a nota da disciplina "+aluno.Disciplina[i]+" :");
			aluno.Nota[i] = input.nextDouble();
			if(aluno.Nota[i]<0 || aluno.Nota[i]>10) {
				aluno.Erro = true;
				aluno.Corrigir(i);
			}
		}	
		
		aluno.VerificarNotas();
	}

}
