package ListaCondicionais;

import java.util.Scanner;

public class MaiorDeTresInteiros {
	
	
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Valor do primeiro numero : ");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o Valor do segundo numero : ");
		int segundoNumero = sc.nextInt();
		
		System.out.println("Digite o Valor do terceiro numero : ");
		int terceiroNumero = sc.nextInt();
		
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior desses Numeros � : " + primeiroNumero + ", foi o primeiro n�mero digitado" );
		}
			if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
				System.out.println("O maior desses Numeros � : " + segundoNumero + ", foi o segundo n�mero digitado");
			}
				if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
					System.out.println("O maior desses Numeros � : " + terceiroNumero + ", foi o terceiro n�mero digitado");
				}
					if (primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
						System.out.println("O maior desses Numeros � : " + primeiroNumero + ", foi o primeiro e segundo n�mero digitado" );
					}
						if (primeiroNumero > segundoNumero && primeiroNumero == terceiroNumero) {
							System.out.println("O maior desses Numeros � : " + primeiroNumero + ", foi o primeiro e terceiro n�mero digitado" );
						}
							if (terceiroNumero == segundoNumero && primeiroNumero < terceiroNumero) {
								System.out.println("O maior desses Numeros � : " + terceiroNumero + ", foi o segundo e terceiro n�mero digitado" );
							}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
