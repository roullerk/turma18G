package ListaCondicionais;

import java.util.Scanner;

public class PareImparPositivoeNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
			if (numero % 2 == 0)	{
				if (numero < 0){
						System.out.println("O número " + numero +" é par e negativo");
					}
				else {
						System.out.println("O número " + numero +" é par e positivo");
					}
				}
					 if(numero % 2 != 0) 	{
						 if (numero > 0 ) {
							 System.out.println("O número " + numero + " é ímpar e positivo");
					}
					 else
					{
						System.out.println("O número " + numero + " é ímpar e negativo");
					}
	}
				System.out.println("Fim do programa!");			
				
				sc.close();

	}

}
