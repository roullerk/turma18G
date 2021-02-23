programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a , b , c , d, a2, b2, c2, d2
		//inicioDoPrograma
		escreva("Digite o primeiro número: ")
		leia(a)
		limpa()
		escreva("Digite o segundo número: ")
		leia(b)
		limpa()
		escreva("Digite o terceiro número: ")
		leia(c)
		limpa()
		escreva("Digite o quarto número: ")
		leia(d)
		limpa()

		a2 = a * a
		b2 = b * b
		c2 = c * c 
		d2 = d * d
		se (c2 >= 1000)
		{
			escreva ("O quadrado de ",c," é ", c2,"!")
		}
		senao
		{
			escreva ("O quadrado de ",a," é ", a2)
			escreva ("\nO quadrado de ",b," é ", b2)
			escreva ("\nO quadrado de ",c," é ", c2)
			escreva ("\nO quadrado de ",d," é ", d2)
		}
		

		escreva("\nFim do programa!")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */