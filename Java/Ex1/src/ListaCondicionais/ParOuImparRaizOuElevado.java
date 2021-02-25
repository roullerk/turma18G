package ListaCondicionais;

import java.util.Scanner;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
 *  Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

public class ParOuImparRaizOuElevado {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		double valor;
		
		System.out.println("Digite o número : ");
		double numero = sc.nextDouble();
		
		if (numero % 2 == 0) {
			valor = Math.sqrt(numero);
			System.out.println("O numero " + numero + " e ele é par, o valor da raíz quadrada dele é : " + valor);	
			}
		else {
			valor = Math.pow(numero, 2);
			System.out.println("O número " + numero + " e ele é impar, o valor quadrado dele é : " + valor);
		}
			

		sc.close();
	}

}
