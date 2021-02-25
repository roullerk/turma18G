package ListaCondicionais;

import java.util.Scanner;

public class IndicePoluicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o indice de poluição : ");
		double indice = sc.nextDouble();
		
		if (indice < 0.3) {
			System.out.println("Nivel de pouluição aceitavel ");
		}
			if (indice >= 0.3 && indice < 0.4 ){
				System.out.println("Industria 1, vocês devem suspender as atividades devido ao aumento de poluição");
			}	
				if (indice >= 0.4 && indice <=0.49  ){
					System.out.println("Industria 1 e Industria 2, vocês devem suspender as atividades devido ao aumento de poluição");
				}	
		if (indice >= 0.5){
			System.out.println("Industria 1 e Industria 2 e Industria 3, vocês devem suspender as atividades devido ao aumento de poluição");
		}	

		sc.close();
	}

}
