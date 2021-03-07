package CLASSES;

//Victor França

public class ContaEspecial extends Conta {

	double limite;

	
										// CONSTRUTOR 
	public ContaEspecial(int numero,/* String cpf, boolean ativa,*/ double limite) {
		super(numero/*, cpf, ativa*/);
		this.limite = 1000;
	}

	
	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}

						
			@Override
			public void Credito(double valor) {
				super.Credito(valor);
			}
			
			@Override
			
			public void Debito(double valor) {
				super.Debito(valor);
				if (super.getSaldo() >= valor) {
					saldo -= valor;
				}
				else if (super.getSaldo() < 0 && valor < super.getSaldo() + limite){
					
				}
			}
	
	
	
	
	
															//METODO
	public double usarLimite(double valor) {
		if(super.getSaldo() < 0 && valor < limite + super.getSaldo()) {
			double diferenca = valor - super.getSaldo();
			limite =- diferenca ;
			super.Credito(diferenca);
			}
			return limite;
	}
	
	
	
	
}
