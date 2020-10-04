package Aula17;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.println("("+(i+1)+") Insira um número inteiro:");
			num[i] = input.nextInt();
		}
		int maior=num[0];
		for (int i=1;i<num.length;i++) {
			if(num[i]>num[i-1]) {
				maior = num[i];
			}
		}
		System.out.println("Maior número: " +maior);
	}
}
