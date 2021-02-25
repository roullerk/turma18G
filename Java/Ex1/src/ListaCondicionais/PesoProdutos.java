package ListaCondicionais;

import java.util.Scanner;

public class PesoProdutos {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int ex = 0;
		double m = 0;
	
		System.out.println("Digite o peso do produto: ");
		int peso = sc.nextInt();
		if (peso > 50)	{
			ex = peso -50;
			m = 4 * peso;
			System.out.printf("Você ultrapassou o limite permitido por %d" ,ex);
					System.out.printf("[kg]. Sua multa é de R$: %.2f\n",m);
		}
		else{
			System.out.println("O peso do produto é: "+ peso +"[kg], está dentro do limite");
		}

		System.out.println("Fim do programa!");

		sc.close();
	}

}
