package entidade;

public class Contribuinte {
	private String nome;
	protected double rendAnual;
	
	public Contribuinte() {
	}
	
	public Contribuinte(String nome, double rendAnual) {
		super();
		this.nome = nome;
		this.rendAnual = rendAnual;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendAnual() {
		return rendAnual;
	}
	public void setRendAnual(double rendAnual) {
		this.rendAnual = rendAnual;
	}
	public double taxa() {
		return 0;
	}
	
}
