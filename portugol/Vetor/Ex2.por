programa
{
	
	funcao inicio()
	{
		inteiro dado[10]
		real media 
		inteiro maior = 0 , y, vezes = 0, soma = 0

			para ( inteiro i = 0 ; i < 10 ; i++ ){
				escreva("\nNúmero que caiu : " )
				leia(dado[i])
				se ( dado[i] > maior) {
					maior = dado[i]
				}
		
			}
			para ( inteiro i = 0 ; i < 10 ; i++ ) {
				soma += dado[i]
					se ( maior ==  dado[i]){
						vezes++
					}
			}
			media = soma / 10
			escreva("\n", " Média : ",media )
			escreva("\n", "Numero maior : ",maior)
			escreva("\n", "Aparece : ", vezes)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */