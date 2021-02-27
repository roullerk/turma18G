programa
{
	
	funcao inicio()
	{
		real indice
		

		escreva("Digite o indice de poluição : ")
		leia(indice)
		
		se (indice < 0.3){
			escreva ("\nNivel de pouluição aceitavel ")
		}
			senao
			
		se (indice >= 0.3 e indice < 0.4 ){
			escreva ("\nIndustria 1, vocês devem suspender as atividades devido ao aumento de poluição")
		}	
			senao 
		
		se (indice >= 0.4 e indice <=0.49  ){
			escreva ("\nIndustria 1 e Industria 2, vocês devem suspender as atividades devido ao aumento de poluição")
		}	
			senao
		
		se	(indice >= 0.5){
			escreva ("\nIndustria 1 e Industria 2 e Industria 3, vocês devem suspender as atividades devido ao aumento de poluição")
		}	
	
			

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */