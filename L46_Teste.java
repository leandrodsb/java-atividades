package Aula46;

public class Teste {

	public static void main(String[] args) {
		Piramide piramide = new Piramide("Pirâmide", 2,3,3 );
		Cilindro cilindro = new Cilindro("Cilindro", 2, 5);
		Cubo cube = new Cubo("Cubo", 4);
		Triangulo triangulo = new Triangulo("Triângulo", 2,3);
		Circulo circulo = new Circulo("Círculo", 2);
		Quadrado quad = new Quadrado("Quadrado", 5);
		
		FiguraGeometrica[] figuras = {triangulo, circulo, quad, piramide, cilindro, cube};
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("---------------");
			System.out.println(figura.getNome());
			if(figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println("Área: "+f2d.calcularArea());
			}
			if(figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println("Área: "+f3d.calcularArea());
				System.out.println("Volume: "+f3d.calcularVolume());
			}
		}
		
		//Opção alternativa:
		/*for(FiguraGeometrica a : figGeo) {
			System.out.println("-----------");
			System.out.println(a);
		}*/
		
		
	}
}
