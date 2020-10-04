package Aula35;
import java.util.Scanner;

public class Fibonacci {
	
	public static int Fibonacci (int num) {
			
		if(num<2) {
			return 1;
		} 
		
		return Fibonacci(num-2) + Fibonacci(num-1);
		
			
			
	}
		
}
