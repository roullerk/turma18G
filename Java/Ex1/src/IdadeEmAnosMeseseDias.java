import java.util.Scanner;

public class IdadeEmAnosMeseseDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua Idade em dias : ");
		int dias = sc.nextInt();
		
		int anos = dias / 365 ; 
		int meses = (dias % 365) / 30;
		int diasn = (dias % 365) % 30;
		
		System.out.println("Sua idade em Anos é : " + anos + ", sua idade em Meses é : " + meses + ", sua idade em dias é : " + diasn );
		sc.close();
		
		
		}

}
