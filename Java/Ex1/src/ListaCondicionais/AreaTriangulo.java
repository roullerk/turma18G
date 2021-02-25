package ListaCondicionais;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da base : " );
		double base = sc.nextDouble();
		System.out.println("Digite o valor de altura : " );
		double altura = sc.nextDouble();
		
		double area;
		
		if ( base >= 0 && altura >= 0 ) {
			area = (base * altura) / 2;
			System.out.println("A area é : " + area);
		}
		else {
			System.out.println("Encerrando programa : Numero invalido" );
			
		}

		System.out.println("Programa Finalizado");
		
		sc.close();

	}

}
