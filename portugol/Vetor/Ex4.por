programa
{
	
	funcao inicio()
	{
		inteiro m[3][3]
		inteiro soma = 0, somad = 0

			para (inteiro i = 0 ; i < 3 ; i++){
				para (inteiro j = 0 ; j < 3 ; j++){
					escreva(" Digite o número da matriz : " )
				 leia(m[i][j])
				  soma += m[i][j]
				  	se ( i >0 e j > 0){
				  				somad += m[i][j-1]
				  			}
				  		}
			}
				
	
			
			
			limpa()
			escreva("Soma de todos : ",soma)
			escreva("\nSoma da Diagonal Principal : ", somad)
			//escreva("\n",somad)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */