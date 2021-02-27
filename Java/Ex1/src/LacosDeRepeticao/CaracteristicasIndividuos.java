package LacosDeRepeticao;

import java.util.Scanner;

public class CaracteristicasIndividuos {

	/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
	 *psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	 *era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	 *(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	 *agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
  	 *pessoas, calcule e mostre: (WHILE)
	 * o n�mero de pessoas calmas;
	 * o n�mero de mulheres nervosas;
 	 * o n�mero de homens agressivos;
	 * o n�mero de outros calmos;
	 * o n�mero de pessoas nervosas com mais de 40 anos;
  	 * o n�mero de pessoas calmas com menos de 18 anos.
	*/ 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		int contPMQ = 0;
		int contCalm = 0, contOutCal = 0, contPCM = 0;
		int contFNerv = 0;
		int contHAgress = 0;
		
	while (i < 150) {
		System.out.println("Digite sua idade : ");
		int idade = sc.nextInt();
		System.out.println("Informe seu sexo : (M para Masculino | F para Feminino | O para outros");
		char sexo = sc.next().toUpperCase().charAt(0);
		System.out.println("Digite sua op��o : (1 - Calma(o)  | 2 - Nervosa(o) | 3 - Agressiva(o)");
		byte opcao = sc.nextByte();
		
		if (sexo != 'M' && sexo != 'F' && sexo != 'O') {
			System.out.println("Sexo Indefinido | Finalizando ! ");
			i = 150;
		}
		
		if (opcao != 1 && opcao != 2 && opcao != 3 ) {
			  System.out.println("Op��o invalida | Finalizando ! ");
			  i = 150;
		  }
			else if (opcao == 1) {
				contCalm++;
			}
				
				if (opcao == 2 && sexo == 'F') {
					contFNerv ++;
				}
				if (opcao == 3 && sexo =='M') {
					contHAgress++;
				}
				if (opcao == 1 && sexo == 'O') {
					contOutCal++;
				}
				if (opcao == 2 && idade > 40) {
					contPMQ++;
				}
				if (opcao == 1 && idade < 18) {
					contPCM++;
				}
		 
			i++;
	}
	System.out.println("O numero de pessoas calmas : " + contCalm);
	System.out.println("O numero de mulheres nervosas : " + contFNerv);
	System.out.println("O numero de homens agressivos : " + contHAgress);
	System.out.println("O numero de outros calmos � : " + contOutCal);
	System.out.println("O numero de pessoas nervosas com mais de 40 anos : " + contPMQ);
	System.out.println("O numero de pessoas calmas com menos de 18 anos : " + contPCM);
	
		
		
		
		
		
		sc.close();
	}

}
