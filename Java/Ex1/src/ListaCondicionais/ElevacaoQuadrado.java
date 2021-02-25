package ListaCondicionais;

import java.util.Scanner;

public class ElevacaoQuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		double primeiroNumero = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double segundoNumero = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double terceiroNumero = sc.nextDouble();
		System.out.println("Digite o quarto número: ");
		double quartoNumero = sc.nextDouble();

		
		if (Math.pow(terceiroNumero, 2) >= 1000)	{
			System.out.println("O quadrado de " + terceiroNumero + " é " + Math.pow(terceiroNumero, 2) + "!");
		}
		else{
			System.out.println("O quadrado de " + primeiroNumero + " é " + Math.pow(primeiroNumero, 2));
			System.out.println("O quadrado de " + segundoNumero + " é " + Math.pow(segundoNumero, 2));
			System.out.println("O quadrado de " + terceiroNumero + " é " + Math.pow(terceiroNumero, 2));
			System.out.println("O quadrado de " + quartoNumero + " é " + Math.pow(quartoNumero, 2));
		}
		

		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
