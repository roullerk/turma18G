package ARRAYS;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int lancamentos[] = new int[10];
		double maior =0;
		double maiorx = 0;
		
		for (int  i = 0 ; i < lancamentos.length ; i++) {
			System.out.printf("Lançamento de dao : %d", i);
			lancamentos[i] = (int) (Math.random()*6)+1;
				if (lancamentos[i] > maior) {
					maior = lancamentos[i];
				}
		}
		for (int i = 0 ; i < lancamentos.length ; i++ ) {
			if(lancamentos[i] > maior) {
				maiorx++;
			}
		}
	}

}
