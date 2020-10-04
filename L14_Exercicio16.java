package aula14;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor das constantes da equação.");
		System.out.println("Formato: ax2+bx+c"); 
		System.out.println("Valor de a:"); double a = scan.nextDouble();
		if (a==0) {
			System.out.println("Não é uma equação de segundo grau.\nPorgrama encerrado.");
		} else {
			System.out.println("Valor de b:"); double b = scan.nextDouble();
			System.out.println("Valor de c:"); double c = scan.nextDouble();
			double delta = Math.pow(b, 2) - 4*a*c;
			if(delta<0) {
				System.out.println("Delta negativo. Não há raízes reais para a equação.");
			} else if(delta==0) {
				System.out.println("Há apenas uma raiz X real.\nX = " +(-b/2*a));
			} else if(delta>0) {
				System.out.println("Há duas raízes reais.\nX1 = " +(-b+Math.sqrt(delta))/2*a);
				System.out.println("X2 = " +(-b-Math.sqrt(delta))/2*a);
			}
		}
		
	
	}

}
