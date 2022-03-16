package entidade;

public class PessoaJuridica extends Contribuinte{
	private int numEmpregados;

	public PessoaJuridica() {
	}
	public PessoaJuridica(String nome, double rendAnual, int numEmpregados) {
		super(nome, rendAnual);
		this.numEmpregados = numEmpregados;
	}
	public int getNumEmpregados() {
		return numEmpregados;
	}
	public void setNumEmpregados(int numEmpregados) {
		this.numEmpregados = numEmpregados;
	}
	@Override
	public double taxa() {
		double total = 0.0;
		
		if (numEmpregados<=10) {
		total = rendAnual * 0.16;
		}else {
		total = rendAnual * 0.14;
		}
		return total;
	}
	
}
