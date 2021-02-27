import java.util.Scanner;

public class DesafioFuncaoLaco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero que deseja de linhas : ");
		int numero = sc.nextInt();
		
		linha(numero);

		sc.close();
	}
	
	public static void linha (int numero) {
		for (int i = 0 ; i < numero ; i++) {
			System.out.print("-");
		}
	}

}
