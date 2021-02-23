programa
{
	
	funcao inicio()
	{
		real n = 0.00, he= 0.00, ex = 0.00	
		inteiro c
		//inicioDoPrograma
		escreva("Digite  os quatro digitos finais de seu registro na empresa: ")
		leia(c)
		escreva("Digite as quantidade de horas trabalhadas: ")
		leia(n)
		se (n > 50)
		{
			ex = n - 50
			he = ex * 20.00
			escreva("Olá funcionário ",c,". Você fez: ",ex," hora[s] a mais!")
			escreva("\nPor isso irá receber R$ ",he," referentes a essas horas adicionais. Aproveite!")
		}
		senao
		{
			escreva("Olá funcionário ",c,". Você fez: ",ex," hora[s] a mais!")
			escreva("\nPor isso não irá receber valor adicional esse mês!")
		}
		escreva("\nFim do programa!")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */