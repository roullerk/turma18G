import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite valor de A : ");
		double a = sc.nextDouble();
		System.out.println("Digite valor de B : ");
		double b = sc.nextDouble();
		System.out.println("Digite valor de C : ");
		double c = sc.nextDouble();
		
		double r = Math.pow(a + b, 2);
		
		double s = Math.pow(b + c, 2);
		
		
		double d = r + s / 2;
		
		System.out.println("Valor de R : " + r);
		System.out.println("Valor de S : " + s);
		System.out.println("Valor de D : " + d);
		
		
		
		
		
		
		sc.close();
	}

}
