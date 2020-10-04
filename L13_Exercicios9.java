package Aulas.Aula13;
import java.util.Scanner;

public class Exercicios9 {
		public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Insira a temperatura em Farenheit:");
			double grauf = scan.nextDouble();
			double grauc = 5*(grauf-32)/9;
			System.out.println("A temperatura em graus Celsius é:" + grauc + " C");
		}

}
