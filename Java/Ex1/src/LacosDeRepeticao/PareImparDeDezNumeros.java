package LacosDeRepeticao;

import java.util.Scanner;

public class PareImparDeDezNumeros {
	
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		int contPar = 0;
		int contImpar = 0;
		int contNeutro = 00;
		
		for (int i = 1 ; i <= 10 ; i++) {
		
			System.out.print("Digite o " + i + "° numero : ");
			int numero = sc.nextInt();
			
			if (numero == 0 ) {
				contNeutro++;
			}
				else if (numero % 2 == 0) {
					contPar++;
				}
			else {
				contImpar++;
			}
			
		}
		System.out.println("Temos " + contPar + " numeros pares");
		System.out.println("Temos " + contImpar + " numeros impares");
		System.out.println("Temos " + contNeutro + " numeros neutros");
		
		System.out.println("Fim");
		
		sc.close();
	}

}
