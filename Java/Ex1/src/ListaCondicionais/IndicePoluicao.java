package ListaCondicionais;

import java.util.Scanner;

public class IndicePoluicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o indice de polui��o : ");
		double indice = sc.nextDouble();
		
		if (indice < 0.3) {
			System.out.println("Nivel de poului��o aceitavel ");
		}
			if (indice >= 0.3 && indice < 0.4 ){
				System.out.println("Industria 1, voc�s devem suspender as atividades devido ao aumento de polui��o");
			}	
				if (indice >= 0.4 && indice <=0.49  ){
					System.out.println("Industria 1 e Industria 2, voc�s devem suspender as atividades devido ao aumento de polui��o");
				}	
		if (indice >= 0.5){
			System.out.println("Industria 1 e Industria 2 e Industria 3, voc�s devem suspender as atividades devido ao aumento de polui��o");
		}	

		sc.close();
	}

}
