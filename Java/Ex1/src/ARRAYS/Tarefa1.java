package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valores[] = new int[5];
		
		for (int x = 0 ; x < 5 ; x++) {
			System.out.printf("Digite o valor do vetor [%d]\n", x +1);
			valores[x] = sc.nextInt();
			
		}
		for (int x = 0 ; x < 5 ; x++) {
			System.out.println(valores[x]);
		}
		
		sc.close();
	}

}
