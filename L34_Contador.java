package Aula34;

public class Contador {
	private static int num;
	
	public Contador() {
		this.num += 1;
	}
	
	public static void MostraNum() {
		System.out.println(num);
	}
	
	public static void ResetNum() {
		num = 0;
	}
}
