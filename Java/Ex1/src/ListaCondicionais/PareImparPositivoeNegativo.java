package ListaCondicionais;

import java.util.Scanner;

public class PareImparPositivoeNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
			if (numero % 2 == 0)	{
				if (numero < 0){
						System.out.println("O n�mero " + numero +" � par e negativo");
					}
				else {
						System.out.println("O n�mero " + numero +" � par e positivo");
					}
				}
					 if(numero % 2 != 0) 	{
						 if (numero > 0 ) {
							 System.out.println("O n�mero " + numero + " � �mpar e positivo");
					}
					 else
					{
						System.out.println("O n�mero " + numero + " � �mpar e negativo");
					}
	}
				System.out.println("Fim do programa!");			
				
				sc.close();

	}

}
