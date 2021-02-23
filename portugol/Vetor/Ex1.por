programa
{
	
	funcao inicio()
	{
		inteiro notas[5]
		inteiro maior = 0

		para (inteiro  i = 0 ; i < 5 ; i++ ) {
			escreva (" Digite a nota da atividade : " )
			leia(notas[i])
			se ( notas[i] > maior) {
				maior = notas[i]
			}
			limpa()
		}
		para (inteiro i = 0 ; i < 5 ; i++ ){
			escreva("\n",notas[i])
		}
		escreva ("\n", "A maior nota é : ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */