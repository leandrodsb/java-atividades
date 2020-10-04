package Testes;

public class OrdenaVet {

	public static void main(String[] args) {
		int vetor[] = new int[3];
		
		for(int i =0 ; i<3 ; i++) {
			System.out.println(OrdenaVetor(vetor)[i]);
		}
	}
	
	
	public static int[] OrdenaVetor (int [] vetor){
		int maior;
		for(int i = 0; i< vetor.length; i++) {
			vetor[i]=i+1;
		}
		return vetor;
	}

}
