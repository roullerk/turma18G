package LacosDeRepeticao;

import java.util.Scanner;
/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

public class MediaMult {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int numero = 0, soma = 0, media = 0, i = 0 ;
		do {
			System.out.print("Digite um numero inteiro : ");
		 numero = sc.nextInt();
		  if (numero % 3 == 0 && numero > 0) {
			  soma += numero;
			  i++;
		  }
		  System.out.println("Digite 0 para parar");
		} while (numero != 0);
		media = soma / i;
		
		System.out.println("A m�dia dos multiplos de 3 � : " + media);
		  
		System.out.println("Finalizando ! ");
		
		sc.close();
	}

}
