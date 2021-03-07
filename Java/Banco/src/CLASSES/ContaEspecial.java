package CLASSES;

// Victor França

public class ContaEspecial extends Conta {

	double limite = 1000;

	// CONSTRUTOR
	public ContaEspecial(int numero) {
		super(numero);
	}

	public double getLimite() {
		return limite;
	}

	public double usarLimite(double valor) {
		double saldo = super.getSaldo();
		double diferenca = valor - saldo;
		this.limite -= diferenca;
		System.out.print("seu limite é : ");
		super.Credito(saldo);
		System.out.print(limite);
		return limite;
	}

	@Override
	public void Debito(double valor) {
		double saldo = super.getSaldo();
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			this.usarLimite(valor);
		}
	}

}
