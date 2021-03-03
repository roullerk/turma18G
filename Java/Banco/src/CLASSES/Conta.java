package CLASSES;

public class Conta {

	   private int numero; 	
	   private String cpf;
	   private double saldo;
	   private boolean ativa;
	   
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

	
	public void Credito (double valor) {
		saldo += valor;

	
	}
	public void Debito (double valor) {
		if (saldo >= valor) {
			saldo -= valor ;
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
}
