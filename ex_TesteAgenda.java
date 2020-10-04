package Testes;
import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda:");
		Agenda agenda = new Agenda(input.nextLine());
		
		Contato[] contatos = new Contato[3];
		
		for(int i =0 ; i<contatos.length; i++) {
			Contato auxContato = new Contato();
			System.out.println("Entre com os dados do contato "+(i+1)+":\n");
			System.out.println("Nome: ");
			auxContato.setNomeContato(input.nextLine());
			System.out.println("Endereço: ");
			auxContato.setEndereco(input.nextLine());
			System.out.println("E-mail: ");
			auxContato.setEmail(input.nextLine());
			
			contatos[i] = auxContato;
		}
		
		agenda.setContato(contatos);
		System.out.println(agenda.MostrarInfo());
	}

}
