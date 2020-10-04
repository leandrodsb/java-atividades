package Aula34;

public class ConversaoUnidadeDeTempo {
	
	public static double MinutoParaSegundo(double min) {
		return (min*60);
	}
	public static double HoraParaMinuto(double hora) {
		return (hora*60);	
	}
	public static double DiaParaHora(int dia) {
		return (dia*24);
	}
	public static int SemanaParaDia(int semana) {
		return (semana*7);
	}
	public static int MesParaDia(int mes) {
		return (mes*30);
	}
	public static double AnoParaDia(int ano) {
		return (ano*365.25);
	}
}
