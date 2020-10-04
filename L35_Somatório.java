package Aula35;

public class Somatório {
	
	public static int Somatoria (int num) {
		
		if(num==1) {
			return 1;
		}
		
		return num+Somatoria (num-1);
	}

}
