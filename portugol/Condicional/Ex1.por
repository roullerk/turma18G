programa
{
	
	funcao inicio()
	{
		real p = 0.00, ex = 0.00, m = 0.00
		//inicioDoPrograma
		escreva("Digite o peso do produto: ")
		leia(p)
		se (p > 50)
		{
			ex = p -50
			m = 4 * p
			escreva("\nVocê ultrapassou o limite permitido por ", ex ,"[kg]. Sua multa é de R$: ",m)
		}
		senao
		{
			escreva("O peso do produto é: ",p,"[kg]")
		}

		escreva("\nFim do programa!")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */