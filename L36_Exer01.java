package Aula36;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda("Meus contatos");
		Contato[] contatos = new Contato[3];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0 ; i<contatos.length; i++) { //nome, enderco, email
			Contato c = new Contato();
			
			System.out.println("Insira os dados do contato "+(i+1)+":");
			
			System.out.println("Entre com o nome do contato:");
			c.setNome(input.nextLine());
			System.out.println("Entre com o telefone do contato:");
			c.setTelefone(input.nextLine());
			System.out.println("Entre com o email do contato:");
			c.setEmail(input.nextLine());
			
			contatos[i] = c;
			
		}
		
		agenda.setContatosAgenda(contatos);
		
		if(agenda!= null) {
			System.out.println(agenda.ObterInfo());
		}
		
		
	}
	
	

}
