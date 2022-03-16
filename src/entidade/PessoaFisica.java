package entidade;

public class PessoaFisica extends Contribuinte{
	public double gastoSaude;

	public PessoaFisica() {
	}
	public PessoaFisica(String nome, double rendAnual, double gastoSaude) {
		super(nome, rendAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public double taxa() {
		double taxa = 0.0;
		double total = 0.0;
		if (rendAnual < 20000.00) {
		taxa = rendAnual * 0.15;
		}else {
		taxa = rendAnual * 0.25;
		}
		gastoSaude = gastoSaude * 0.5;
		total = taxa-gastoSaude;
		return total;
	}
	
}
