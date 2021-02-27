package LacosDeRepeticao;

import java.util.Scanner;

	/*Crie um programa que leia um número do teclado até que encontre um
	 *número igual a zero. No final, mostre a soma dos números
	 *digitados.(DO...WHILE)
	 */
public class LeituraLaco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int numero , soma = 0;
		
		do {
			System.out.println("Digite o Numero : ");
			 numero = sc.nextInt();
			soma += numero;
		}while (numero != 0);
		
		
		
		System.out.println("A soma é : " + soma);
		
		
		
		sc.close();
	}

}
