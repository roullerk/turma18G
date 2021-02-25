package ListaCondicionais;

import java.util.Scanner;

public class MaiorDeTresInteiros {
	
	
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Valor do primeiro numero : ");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o Valor do segundo numero : ");
		int segundoNumero = sc.nextInt();
		
		System.out.println("Digite o Valor do terceiro numero : ");
		int terceiroNumero = sc.nextInt();
		
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior desses Numeros é : " + primeiroNumero + ", foi o primeiro número digitado" );
		}
			if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
				System.out.println("O maior desses Numeros é : " + segundoNumero + ", foi o segundo número digitado");
			}
				if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
					System.out.println("O maior desses Numeros é : " + terceiroNumero + ", foi o terceiro número digitado");
				}
					if (primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
						System.out.println("O maior desses Numeros é : " + primeiroNumero + ", foi o primeiro e segundo número digitado" );
					}
						if (primeiroNumero > segundoNumero && primeiroNumero == terceiroNumero) {
							System.out.println("O maior desses Numeros é : " + primeiroNumero + ", foi o primeiro e terceiro número digitado" );
						}
							if (terceiroNumero == segundoNumero && primeiroNumero < terceiroNumero) {
								System.out.println("O maior desses Numeros é : " + terceiroNumero + ", foi o segundo e terceiro número digitado" );
							}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
