package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Conta conta1 =  new Conta(1775, "Victor", true);
		System.out.println("Digite o valor de depósito : ");
		double valor = sc.nextDouble();
		conta1.Credito(valor);
		System.out.println("Saldo : ");
		System.out.println(conta1.getSaldo());
		
		System.out.println("Se Deseja fazer um depósito digite : D se deseja fazer um saque digite S ?");
		char opcao = sc.next().toUpperCase().charAt(0);
		if (opcao == 'D') {
			System.out.println("Digite o valor a ser depósitado : ");
			double deposito = sc.nextDouble();
			conta1.Credito(deposito);
		}
		else if (opcao == 'S') {
			System.out.println("Digite o valor do saque : ");
			double saque = sc.nextDouble();
			conta1.Debito(saque);
		}
		System.out.println("Total na conta : ");
		System.out.println(conta1.getSaldo());
		
		
		sc.close();
	}

}
