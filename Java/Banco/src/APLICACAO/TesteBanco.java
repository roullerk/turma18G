package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class TesteBanco {

	public static void main(String[] args) {

				Scanner sc = new Scanner (System.in);
				ContaEspecial ce = new ContaEspecial(28,18);
				int i=0;
				
				
				char opcao = sc.next().toUpperCase().charAt(0);
				
				do {
				if (opcao == 'C') {
					System.out.println("Credite : ");
					double a = sc.nextDouble();
					ce.Credito(a);
				}
				else if (opcao == 'D') {
					System.out.println("Saque");
					double a = sc.nextDouble();
					ce.Debito(a);
						if (ce.getSaldo() < a) {
							System.out.println(ce.usarLimite(a));
							ce.getLimite();
						}
						i++;
				}
				}while (i<=10);
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*		char tipoConta;
						char contaPoupança; //tipoConta
						char contaCorrente; //tipoConta
						char contaEspecial; //tipoConta
						char contaEmpresarial; //tipoConta
						char contaEstudantil; //tipoConta
						double valor;
						char opcao;
						double LimiteEstudantilAtual; 
						//1-poupança, 2-corrente, 3-especial, 4-empresarial, 5-estudantil, 6-sair
						
						
						//ESCOLHA CONTA
					System.out.println(" BANCO DiMadeira ");
					System.out.println(" XXXXXX ");
					System.out.println(" 1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil: ");
					tipoConta = sc.next().charAt(0);
					Conta cliente = new Conta (tipoConta);
					
					
					
					//ESCOLHA TIPO CONTA
					if (tipoConta == '1') {
							contaPoupança = tipoConta ;
							System.out.println("A conta selecionada foi Poupança!");
						}
						if (tipoConta == '2') {
							contaCorrente = tipoConta ;
							System.out.println("A conta selecionada foi Corrente!");
						}
						if (tipoConta == '3') {
							contaEspecial = tipoConta ;
							System.out.println("A conta selecionada foi Especial!");
							ContaEspecial CE = new ContaEspecial(5,25);
							double s = sc.nextDouble();
							CE.Debito(s);
							System.out.println(CE.usarLimite(s));	
						}
						if (tipoConta == '4') {
							contaEmpresarial = tipoConta ;
							System.out.println("A conta selecionada foi Empresarial!");
						}
						if (tipoConta == '5') {
							contaEstudantil = tipoConta ;
							System.out.println("A conta selecionada foi Estudantil!");
							
						}
						if (tipoConta == '6') {
							
							System.out.println("Você saiu da operação!");
						}*/
						//FIM ESCOLHA DE CONTA
				
						//System.out.println("Digite o valor:");
						//valor = sc.nextDouble();
						//System.out.println("O valor do saldo atual é: "+cliente.getSaldo());
	}

}
