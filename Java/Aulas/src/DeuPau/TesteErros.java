package DeuPau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		String nomes[] = {"Marcos", "Matheus", "Mario"};;
		
		
		try {
			System.out.println("Digite o numero do vetor : [0-2]");
			int numero = sc.nextInt();
			System.out.println("O nome escolhido � : " + nomes[numero]);
		}
		catch(InputMismatchException erro) {
		System.out.println("Voc� digitou uma letra ao inv�s de numero");
		erro.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException erro) {
			System.out.println("Voc� digitou um valor n�o permitido.");
		}
		System.out.println("Fim de Programa");
		
		sc.close();

	}

}
