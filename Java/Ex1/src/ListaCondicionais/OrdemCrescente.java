package ListaCondicionais;

import java.util.Scanner;

		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Valor do primeiro numero : ");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o Valor do segundo numero : ");
		int segundoNumero = sc.nextInt();
		
		System.out.println("Digite o Valor do terceiro numero : ");
		int terceiroNumero = sc.nextInt();
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("A ordem Crescente � : " + terceiroNumero + " , " + segundoNumero + " , " + primeiroNumero);
		}
			if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero) {
				System.out.println("A ordem Crescente � : " + segundoNumero + " , " + terceiroNumero + " , " + primeiroNumero);
			}
				if (primeiroNumero > segundoNumero && primeiroNumero < terceiroNumero && segundoNumero < terceiroNumero) {
					System.out.println("A ordem Crescente � : " + segundoNumero + " , " + primeiroNumero + " , " + terceiroNumero);
				}
					if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero && segundoNumero < terceiroNumero) {
						System.out.println("A ordem Crescente � : " + primeiroNumero + " , " + segundoNumero + " , " + terceiroNumero);
					}
					if (primeiroNumero < segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero) {
						System.out.println("A ordem Crescente � : " + terceiroNumero + " , " + primeiroNumero + " , " + segundoNumero);
					}
						if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero && segundoNumero > terceiroNumero) {
							System.out.println("A ordem Crescente � : " + primeiroNumero + " , " + terceiroNumero + " , " + segundoNumero);
						}
							if(primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
								System.out.println("A ordem Crescente � : " + primeiroNumero + " , " + terceiroNumero + " , " + segundoNumero);
							}
								if (primeiroNumero == segundoNumero && primeiroNumero < terceiroNumero) {
									System.out.println("A ordem Crescente � : " + primeiroNumero + " , " + segundoNumero + " , " + terceiroNumero);
								}
								 if (primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
										System.out.println("A ordem Crescente � : " + terceiroNumero + " , " + segundoNumero + " , " + primeiroNumero);
									}
								 	if (terceiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
								 			System.out.println("A ordem Crescente � : " + terceiroNumero + " , " + segundoNumero + " , " + primeiroNumero);
									}
								 		if (terceiroNumero == segundoNumero && primeiroNumero < terceiroNumero) {
								 			System.out.println("A ordem Crescente � : " + primeiroNumero + " , " + segundoNumero + " , " + terceiroNumero);
								 		}
								 	
			sc.close();
	}

}
