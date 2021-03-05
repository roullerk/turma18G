package POO;

public class Terceiro extends Funcionario {

	private double adicional;

	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adcional) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adcional;
	}

	public double getAdcional() {
		return adicional;
	}

	public void setAdcional(double adicional) {
		this.adicional = adicional;
	}
	 public double salario () {

	        return (horasTrabalhadas * valorPorHora) + adicional;
	    }
	    @Override
	    public double salario (double imposto) {
	        return (horasTrabalhadas * valorPorHora) - ((horasTrabalhadas * valorPorHora) * imposto);
	
	    }

}