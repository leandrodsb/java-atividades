package Aula35;

public class Somat�rio {
	
	public static int Somatoria (int num) {
		
		if(num==1) {
			return 1;
		}
		
		return num+Somatoria (num-1);
	}

}
