package ListaCondicionais;

import java.util.Scanner;

public class IdadeCategoria {
	/*
	 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	 *	10-14 infantil
	 *	15-17 juvenil
	 *	18-25 adulto
	 */

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua idade : ");
		int idade = sc.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua Categoria � : Infantil");
		}
			if (idade >= 15 && idade <= 17) {
				System.out.println("Sua Categoria � : Juvenil");
			}
				if (idade >= 18 && idade <= 25) {
					System.out.println("Sua Categoria � : Adulto");
				}
					if (idade < 10) {
						System.out.println("Muito novo para entrar em uma categoria!");
					}
						if (idade > 25) {
							System.out.println("N�o temos categoria para esta idade");
						}
		
		sc.close();
	}

}
