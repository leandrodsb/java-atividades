package Aula34;

public class Calculadora {
	
	public Calculadora() {}
	
	public static double Soma (double num1, double num2) {
		return (num1+num2);
	}
	public static double Subtrair (double num1, double num2) {
		return (num1-num2);
	}
	public static double Multiplicar (double num1, double num2) {
		return (num1*num2);
	}
	public static double Dividir(double num1, double num2) {
		return (num1/num2);
	}
	public static double Pot (double num, double n) {
		double total=1;
		for(int i = 0 ; i<n; i++) {
			total *= num; 	
		}
		return total;
	}
	
	public static int Fatorial (int n) { 
		int fatorial = 1;
		if(n==0 || n==1) {
			return fatorial;
		}else {
			for(int i = n; i>0; i--) { 
				fatorial *= i;
			}
			return fatorial;
		}		
	}

}
