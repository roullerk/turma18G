package POO;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		
		ObjCliente cliente = new ObjCliente();
		
		System.out.println("Digite o nome do cliente : ");
		cliente.nome = sc.nextLine();
		
		System.out.println("Digite o CPF do cliente : ");
		cliente.cpf = sc.nextLine();
		
		System.out.println("Digite o ano de nascimento do cliente : ");
		cliente.anoNasc = sc.nextInt();
		
		
		cliente.Dados();
		
		
		
		sc.close();

	}

}
