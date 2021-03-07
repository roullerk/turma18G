package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class TesteBanco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ContaEspecial ce = new ContaEspecial(28);

		char tipoConta;
		char contaPoupanca; // tipoConta
		char contaCorrente; // tipoConta
		char contaEspecial; // tipoConta
		char contaEmpresarial; // tipoConta
		char contaEstudantil; // tipoConta
		double valor;
		char opcao;
		double LimiteEstudantilAtual;
		// 1-poupanca, 2-corrente, 3-especial, 4-empresarial, 5-estudantil, 6-sair

		// ESCOLHA CONTA
		System.out.println(" BANCO DiMadeira ");
		System.out.println(" XXXXXX ");
		System.out.println(
				" 1 - Conta Poupanca\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil: ");
		tipoConta = sc.next().charAt(0);
		Conta cliente = new Conta(tipoConta);

		// ESCOLHA TIPO CONTA
		if (tipoConta == '1') {
			contaPoupanca = tipoConta;
			System.out.println("A conta selecionada foi Poupança!");
		}
		if (tipoConta == '2') {
			contaCorrente = tipoConta;
			System.out.println("A conta selecionada foi Corrente!");
		}
		if (tipoConta == '3') {
			contaEspecial = tipoConta;
			System.out.println("A conta selecionada foi Especial!");
			ContaEspecial CE = new ContaEspecial(5);
			System.out.println("Escreve um numero ae: ");
			double s = sc.nextDouble();
			CE.Debito(s);
			if (CE.getSaldo() < 0) {
			//	CE.usarLimite(s);
				
			}
			System.out.println();
			System.out.println("Seu saldo atual é de: " + CE.getSaldo());
		}

		if (tipoConta == '4') {
			contaEmpresarial = tipoConta;
			System.out.println("A conta selecionada foi Empresarial!");
		}
		if (tipoConta == '5') {
			contaEstudantil = tipoConta;
			System.out.println("A conta selecionada foi Estudantil!");

		}
		if (tipoConta == '6') {
			System.out.println("Você saiu da operação!");
		}

	}

}
