package ListaCondicionais;

import java.util.Scanner;

public class ElevacaoQuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double primeiroNumero = sc.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double segundoNumero = sc.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		double terceiroNumero = sc.nextDouble();
		System.out.println("Digite o quarto n�mero: ");
		double quartoNumero = sc.nextDouble();

		
		if (Math.pow(terceiroNumero, 2) >= 1000)	{
			System.out.println("O quadrado de " + terceiroNumero + " � " + Math.pow(terceiroNumero, 2) + "!");
		}
		else{
			System.out.println("O quadrado de " + primeiroNumero + " � " + Math.pow(primeiroNumero, 2));
			System.out.println("O quadrado de " + segundoNumero + " � " + Math.pow(segundoNumero, 2));
			System.out.println("O quadrado de " + terceiroNumero + " � " + Math.pow(terceiroNumero, 2));
			System.out.println("O quadrado de " + quartoNumero + " � " + Math.pow(quartoNumero, 2));
		}
		

		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
