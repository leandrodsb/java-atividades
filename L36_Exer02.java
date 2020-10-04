package Aula36;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Curso curso = new Curso("Engenharia Elétrica", "Noturno");
	
		Professor profCurso= new Professor();
		
		System.out.println("Entre com o nome do professor deste curso: ");
		profCurso.setNomeProf(input.nextLine());
		System.out.println("Entre com o nome do departamento ao qual o professor pertence: ");
		profCurso.setDepart(input.nextLine());
		System.out.println("Entre com o email de contato do professor: ");
		profCurso.setEmail(input.nextLine());
		
		curso.setProf(profCurso);
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i = 0; i< alunos.length ; i++) {
			input.nextLine();
			System.out.println("Entre com o nome do aluno "+(i+1)+":");
			String nomeAluno = input.nextLine(); // alternativo: String nomeAluno = input.nextLine();
			System.out.println("Entre com a matrícula do aluno:");
			String numMatricula = input.nextLine(); // alternativo: auxAluno.setMatricula(numMatricula);
			
			Double[] notas = new Double[4]; //esse vetor precisa estar dentro do loop
			for(int j = 0; j<notas.length; j++) {
				System.out.println("Insira a nota "+(j+1)+":");
				notas[j] = input.nextDouble();
			}
			
			//opcao alternativa: auxAluno.setNomeAluno(nomeAluno);
			//opcao alternativa: auxAluno.setMatricula(numMatricula);
			Aluno auxAluno = new Aluno();
			auxAluno.setNomeAluno(nomeAluno);
			auxAluno.setMatricula(numMatricula);
			auxAluno.setNotas(notas); 
			alunos [i] = auxAluno; //vetor alunos recebe todos os dados da instancia auxiliar, na posição i
		}
		
		curso.setAlunos(alunos); //valores são setados na classe principal
		
		System.out.println(curso.MostrarInfo());
		

	}

}
