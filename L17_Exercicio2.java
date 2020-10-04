package Aula17;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nome de usuário:");
		String usuario = input.next();
		System.out.println("Senha:");
		String senha = input.next();
		while(usuario.equals(senha)){
			System.out.println("Senha igual ao nome de usuário. \nInsira outra senha.");
			senha = input.next();
		}
		System.out.println("Dados inseridos corretamente.\nNome de usuário: " +usuario);
		System.out.println("Senha: " +senha);
	}

}
