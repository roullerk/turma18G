package CLASSES;

public class Conta {

	protected int numero;
	protected String cpf;
	protected double saldo;
	protected boolean ativa;

	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}

	public Conta(int numero) {
		super();
		this.numero = numero;
	}

	public Conta(int numero, String cpf, boolean ativa) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Credito(double valor) {
		if (valor < 0) {
			saldo = 0;
		} else {
			saldo += valor;
		}
	}

	public void Debito(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
}
