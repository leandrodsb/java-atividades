package Aula38.exer01;

public class Professor extends Pessoa{
	private String depart;
	private double salario;
	
	public Professor() {}

	public Professor(String nome, String cpf, String departamento) {
		super.setNome(nome);
		super.setCpf(cpf);
		this.depart = departamento;
	}
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public void MostrarInfo() {
		System.out.println("\nDados do professor:");
		System.out.println("Nome: "+super.getNome()+"\nCpf: "+super.getCpf()+"\nDepartamento:"+depart);
	}
	
	

}
