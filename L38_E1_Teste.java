package Aula38.exer01;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa aluno = new Aluno("Leandro", "123568", "123456");
		Pessoa prof = new Professor("Dr. Z�zinho", "032165","Depto. de Tecnologia");
		
		//prof.setNome("Z�zinho");
		//System.out.println(prof.getNome());
		
		prof.MostrarInfo();
		aluno.MostrarInfo();
	}

}
