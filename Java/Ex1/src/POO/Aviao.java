package POO;

import java.util.Scanner;

public class Aviao {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		ObjAviao aviao = new ObjAviao();
		
		System.out.println("Digite o modelo do avião ");
		aviao.modelo = sc.nextLine();
		System.out.println("Digite o número de série : ");
		aviao.id = sc.nextInt();
		System.out.println("Digite a cor : ");
		aviao.cor = sc.next();
		System.out.println("Digite o Nome do Fabricante : ");
		aviao.fabricante = sc.next();
		System.out.println("Digite a capacidade de Assentos : ");
		aviao.assentos = sc.nextInt();
		System.out.println("Digite a velocidade máxima : ");
		aviao.velocidadeMaxima = sc.nextDouble();		
		
		
		
		aviao.Dados();
		
		
		
		sc.close();

	}

}
