import java.util.Scanner;

public class TempoDuracaoEvento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a duração do evento em segundos : ");
		int segundos = sc.nextInt();
		
		int horas = segundos / 3600 ;
		int minutos = (segundos / 3600) % 60;
		int seg = (segundos % 3600) % 60;
		
		System.out.println("O evento tem : " + horas + " horas, " + minutos + " minutos e " + seg + " segundos");
		
		sc.close();
		
	}

}
