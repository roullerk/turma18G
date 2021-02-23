programa
{
	
	funcao inicio()
	{
		real base, altura , area

		escreva ("Digite o valor da base : " )
		leia(base)
		escreva ("Digite o valor de altura : " )
		leia(altura)

		se ( base >= 0 e altura >= 0 ) {
			area = (base * altura) / 2
			escreva ("A altura é : ", area)
		}
		senao {
			escreva("\nEncerrando programa : Numero invalido" )
			
		}

		escreva ("\nPrograma Finalizado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */