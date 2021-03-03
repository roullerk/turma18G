package POO;

public class ObjCliente {

	String nome, cpf;
	int anoNasc;
	
	public void Dados() {
		System.out.println("---------------------------");
		System.out.println("-----------Dados-----------");
		System.out.println("---------------------------");
		System.out.println("Nome do Cliente : " + nome);
		System.out.println("CPF do cliente : " + cpf);
		System.out.println("Idade : " + (2021 - anoNasc));
	}
	
	
	
}
