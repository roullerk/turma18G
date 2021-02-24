import java.util.Scanner;

public class MediaDeUmAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota do aluno : ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno : ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno : ");
		double nota3 = sc.nextDouble();
		
		
		double peso1 = 2;
		
		double peso2 = 3;
		
		double peso3 = 5;
		
		
		double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.println("A média ponderada : " + media);
		
		
		
		
		
		
		
		
		sc.close();
	}
	
}
