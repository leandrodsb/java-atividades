package Aula17;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nome de usu�rio:");
		String usuario = input.next();
		System.out.println("Senha:");
		String senha = input.next();
		while(usuario.equals(senha)){
			System.out.println("Senha igual ao nome de usu�rio. \nInsira outra senha.");
			senha = input.next();
		}
		System.out.println("Dados inseridos corretamente.\nNome de usu�rio: " +usuario);
		System.out.println("Senha: " +senha);
	}

}
