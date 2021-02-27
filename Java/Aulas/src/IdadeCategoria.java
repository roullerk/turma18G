import java.util.Scanner;

public class IdadeCategoria {
	
		public static void main(String[] args) {
				
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite sua idade : ");
			int idade = sc.nextInt();
			
			if (idade >= 5 && idade <= 7) {
				System.out.println("Sua Categoria é : Infantil A");
			}
				if (idade >= 8 && idade <= 11) {
					System.out.println("Sua Categoria é : Infantil B");
				}
					if (idade >= 12 && idade <= 13) {
						System.out.println("Sua Categoria é : Juvenil A");
					}
						if (idade >= 14 && idade <= 17) {
							System.out.println("Sua Categoria é : Juvenil B");
						}
							if (idade >= 18) {
								System.out.println("Sua Categoria é : Adulto");
							}
							if (idade < 5) {
								System.out.println("Muito novo para entrar em uma categoria");
							}
			
			
			sc.close();
		

	}
}
