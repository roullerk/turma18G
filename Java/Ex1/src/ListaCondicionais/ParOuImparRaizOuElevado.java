package ListaCondicionais;

import java.util.Scanner;
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

public class ParOuImparRaizOuElevado {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		double valor;
		
		System.out.println("Digite o n�mero : ");
		double numero = sc.nextDouble();
		
		if (numero % 2 == 0) {
			valor = Math.sqrt(numero);
			System.out.println("O numero " + numero + " e ele � par, o valor da ra�z quadrada dele � : " + valor);	
			}
		else {
			valor = Math.pow(numero, 2);
			System.out.println("O n�mero " + numero + " e ele � impar, o valor quadrado dele � : " + valor);
		}
			

		sc.close();
	}

}
