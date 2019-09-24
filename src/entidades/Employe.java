package entidades;

public class Employe {
	private Integer id;
	private String nome;
	private double salario;
	
	

	public Employe() {

	}

	public Employe(Integer id, String nome, double salario) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalaraio (double percentual) {
		this.salario += (salario * (percentual/100));
	}
	
	public String toString() {return id + " " + nome + " " + String.format("%.2f%n", salario);}

}
