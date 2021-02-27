import java.util.Scanner;

public class Desafio0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int maior = 0;
		int numero = 0 ;
		while(numero >= 0 ) {
			System.out.println("Digite o numero : ");
			numero = sc.nextInt();
			
				if (numero > maior) {
					maior = numero;
				}
		}
		System.out.println("O maior numero : " + maior);
		
		sc.close();
	}

}
