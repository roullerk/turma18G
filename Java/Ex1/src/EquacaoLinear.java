import java.util.Scanner;

public class EquacaoLinear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Digite valor de B: ");
		double b = sc.nextDouble();
		System.out.println("Digite valor de C: ");
		double c = sc.nextDouble();
		System.out.println("Digite valor de D: ");
		double d = sc.nextDouble();
		System.out.println("Digite valor de E: ");
		double e = sc.nextDouble();
		System.out.println("Digite valor de F: ");
		double f = sc.nextDouble();
		
		double x = (c * e - b * f) / (a * e - b * d);
		
		double y = (a * f - c * d) / (a * e - b * d );
		
		System.out.println("Valor de X : " + x);
		System.out.println("Valor de Y : " + y);
		
		
		
		
		
		
		sc.close();

	}

}
