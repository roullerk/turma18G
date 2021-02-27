package LacosDeRepeticao;

import java.util.Scanner;

public class IdadeDePessoas {

	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	 *21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 *idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int idade = 0;
		int contMenor = 0;
		int contMaior = 0;
		while ( idade != -99 ) {
			System.out.print("Digite sua idade :");
			idade = sc.nextInt();
			if (idade > 21) {
				contMenor++;
			}
			 if (idade > 50) {
				contMaior++;
			}
			 if(idade < 0 && idade > -99) {
				 System.out.println("Idade Invalida : Encerrando!");
				 idade = -99;
			 }
			 System.out.println("Digite -99 ou uma idade negativa para sair!");
		}
		System.out.println();
		System.out.println("Pessoas com mais de 50 anos : " + contMaior);
		System.out.println("Pessoas com menos de 21 anos : " + contMenor);
		
		
		
		sc.close();
	}

}
