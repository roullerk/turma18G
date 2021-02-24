import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite sua Idade em Anos : ");
		int ano = sc.nextInt();
		System.out.println("Digite sua Idade em Meses : ");
		int meses = sc.nextInt();
		System.out.println("Digite sua Idade em Dias : ");
		int dias = sc.nextInt();
		
		int id =  (dias + (ano * 365) + (meses * 30));
		
		System.out.println("Sua idade em dias é : " + id);
		sc.close();
	}

}
