package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List <Funcionario> lista = new ArrayList <> ();
		
		System.out.println("Digite a quantidade de funcionarios na lista: ");
		int quantidade = sc.nextInt();
		
		for (int x=1; x<=quantidade; x++)
		{
			System.out.println("Funcionario " + x);
			System.out.println("1- Funcinario ou 2 -terceiro? ");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Matricula: ");
			int matricula = sc.nextInt();
			System.out.println("Horas Trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			System.out.println("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			
			
			
			if (tipo == '2') {
				System.out.println("Valor do adicional R$: ");
				double adicional = sc.nextDouble();
				lista.add(new Terceiro(nome,matricula,horasTrabalhadas,valorPorHora,adicional));
			}
			else {
				lista.add(new Funcionario(nome,matricula,horasTrabalhadas,valorPorHora));
			}
			
		}
		System.out.println();
		System.out.println("Pagamento de salarios: ");
		
		for (Funcionario fun : lista) {
			System.out.println(fun.getNome() + " seu salário é R$ " + fun.salario());
		}
		System.out.println("Fim de programa!!");
		sc.close();
	}
	
}
