import java.util.Scanner;

public class CustoParaConsumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Valor de Fábrica : ");
		double valorFab = sc.nextDouble();
		
		double percDistribuidor = valorFab * 0.28 ;
		
		double imposto = valorFab * 0.45;
		
		
		double valorConsumidor = valorFab + percDistribuidor + imposto;
		
		System.out.println("O valor para o Consumidor é : " + valorConsumidor);
		
		
		sc.close();
	}

}
