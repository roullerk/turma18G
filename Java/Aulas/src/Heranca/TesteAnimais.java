package POO;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		 int i = 0;
		 
		 do {
			 System.out.println("Digite um numero de 1 a 3 : ");
			 i  = sc.nextInt();
			 	if (i == 1) {
			 		System.out.println("Voc� escolheu Cachorro");
			 		System.out.println("O nome dele � : " + cachorro.getNome() + " e tem : " + cachorro.getIdade() + " anos");
			 		System.out.printf("Cachorro esta latindo : " );
			 		cachorro.Som();
			 		cachorro.Correr();
			 	}
			 	if (i == 2) {
			 		System.out.println("Voc� escolheu Cavalo");
			 		System.out.println("O nome dele � : " + cavalo.getNome() + " e tem : " + cavalo.getIdade() + " anos");
			 		System.out.printf("Cavalo esta relinchando : " );
			 		cavalo.Som();
			 		cavalo.Correr();
			 	}
			 	if(i == 3) {
			 		System.out.println("Voc� escolheu Pregui�a");
			 		System.out.println("O nome dele � : " + preguica.getNome() + " e tem : " + preguica.getIdade() + " anos");
			 		System.out.print("Pregui�a esta  : " );
			 		preguica.Som();
			 		preguica.Correr();
			 	}
		 }while (i != 1 && i != 2 && i != 3);
		 
		
		
		

	}

}
