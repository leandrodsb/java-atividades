package Aula34;

public class ConversaoDeUnidadeDeVolume {
	
	public ConversaoDeUnidadeDeVolume() {}
	
	public static double ConverteLitroEmCentCub(double litro) {
		return (litro*1000);
	}
	public static double ConverteMetroCubEmLitro(double metrocubico) {
		return (metrocubico*1000);
	}
	public static double ConverteMetroCubEmPeCub(double metrocubico) {
		return (metrocubico*35.32);
	}
	public static double ConverteGalaoEmPolCub(double galao) {
		return (galao*231);
	}
	public static double ConverteGalaoEmLitro(double galao) {
		return (galao*3.785);
	}
}
