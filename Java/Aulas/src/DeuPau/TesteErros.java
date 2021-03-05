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
			System.out.println("O nome escolhido é : " + nomes[numero]);
		}
		catch(InputMismatchException erro) {
		System.out.println("Você digitou uma letra ao invés de numero");
		erro.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException erro) {
			System.out.println("Você digitou um valor não permitido.");
		}
		System.out.println("Fim de Programa");
		
		sc.close();

	}

}
