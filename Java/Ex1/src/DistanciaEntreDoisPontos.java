import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			

		System.out.println("Digite P(x1): ");
		double x1 = sc.nextDouble();
		
		System.out.println("Digite P(y1): ");
		double y1 = sc.nextDouble();
		
		System.out.println("Digite P(x2): ");
		double x2 = sc.nextDouble();
		
		System.out.println("Digite P(y2): ");
		double y2 = sc.nextDouble();
		
		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("A distância entre esses dois pontos é : %.2f" , d);
		
		
		
		
		
		
		
		sc.close();
	}

}
