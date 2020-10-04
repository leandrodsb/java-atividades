package Aula17;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro:");
		int num1 = input.nextInt();
		int menor,maior;
		System.out.println("Insira o segundo número inteiro:");
		int num2 = input.nextInt();
		while(Math.abs(num1-num2)==1) {
			System.out.println("Os dois números são respectivos um do outro.\nInsira números com intervalo maior entre si.\n");
			System.out.println("Insira o primeiro número inteiro:");
			num1 = input.nextInt();
			System.out.println("Insira o segundo número inteiro:");
			num2 = input.nextInt();
		}
		if(num1<num2) {
			menor = num1; maior=num2;
		}else {
			menor = num2; maior = num1;
		}
		for(int i=menor; i<maior;i++) {
			System.out.println(i);
		}
	}

}
