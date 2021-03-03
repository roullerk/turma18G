package POO;

import java.util.Scanner;

public class TresTriangulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Triangulos calc = new Triangulos();
		Triangulos calc1 = new Triangulos();
		Triangulos calc2 = new Triangulos();

		System.out.println("Digite a altura do Triangulo 1 : ");
		calc.altura = sc.nextDouble();
		System.out.println("Digite a base do Triangulo 1 : ");
		calc.base = sc.nextDouble();
		
		System.out.println("Digite a altura do Triangulo 2 : ");
		calc1.altura = sc.nextDouble();
		System.out.println("Digite a base do Triangulo 2 : ");
		calc1.base = sc.nextDouble();
		
		System.out.println("Digite a altura do Triangulo 3 : ");
		calc2.altura = sc.nextDouble();
		System.out.println("Digite a base do Triangulo 3 : ");
		calc2.base = sc.nextDouble();
		
		
		calc.calculo();
		calc1.calculo();
		calc2.calculo();
		
		if (calc.calculo() > calc1.calculo() && calc.calculo() > calc2.calculo()) {
			System.out.println("A maior area é do primeiro triangulo com o valor : " + calc.calculo());
			System.out.println("Ele tem a base : " + calc.base + " e altura : " + calc.altura);
		}
		else if (calc1.calculo() > calc.calculo() && calc1.calculo() > calc2.calculo()) {
			System.out.println("A maior area é do segundo triangulo com o valor : " + calc1.calculo());
			System.out.println("Ele tem a base : " + calc.base + " e altura : " + calc1.altura);
		}
		else if (calc2.calculo() > calc.calculo() && calc2.calculo() > calc1.calculo()) {
			System.out.println("A maior area é do terceiro triangulo com o valor : " + calc2.calculo());
			System.out.println("Ele tem a base : " + calc.base + " e altura : " + calc2.altura);
		}
	
		else if (calc.calculo() == calc1.calculo() && calc.calculo() > calc2.calculo()) {
			System.out.println("Primeiro e Segundo Triangulos possuem mesmos valores");
			System.out.println("Base deles : " + calc.calculo());
		}
			
		
		
		
		
		
		
		
		sc.close();

	}

}
