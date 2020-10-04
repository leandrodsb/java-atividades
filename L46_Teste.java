package Aula46;

public class Teste {

	public static void main(String[] args) {
		Piramide piramide = new Piramide("Pir�mide", 2,3,3 );
		Cilindro cilindro = new Cilindro("Cilindro", 2, 5);
		Cubo cube = new Cubo("Cubo", 4);
		Triangulo triangulo = new Triangulo("Tri�ngulo", 2,3);
		Circulo circulo = new Circulo("C�rculo", 2);
		Quadrado quad = new Quadrado("Quadrado", 5);
		
		FiguraGeometrica[] figuras = {triangulo, circulo, quad, piramide, cilindro, cube};
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("---------------");
			System.out.println(figura.getNome());
			if(figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println("�rea: "+f2d.calcularArea());
			}
			if(figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println("�rea: "+f3d.calcularArea());
				System.out.println("Volume: "+f3d.calcularVolume());
			}
		}
		
		//Op��o alternativa:
		/*for(FiguraGeometrica a : figGeo) {
			System.out.println("-----------");
			System.out.println(a);
		}*/
		
		
	}
}
