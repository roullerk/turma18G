programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6] , n2[4][6]
		inteiro m1[4][6] , m2[4][6]


			para ( inteiro i = 0 ; i < 6 ; i++) {
				para( inteiro j = 0 ; j < 4 ; j++){
					escreva (" Digite o valor : ")
					leia(n1[j][i])
					//m1[i][j] = n1[i][j] + n2[i][j]
					//m2[i][j] = n1[i][j] + n2[i][j]
				}
				
			}
			para ( inteiro i = 0 ; i < 6 ; i++) {
				para( inteiro j = 0 ; j < 4 ; j++){
					escreva (" Digite o valor  2 : ")
				     leia(n2[j][i])
				}
			}
			para ( inteiro i = 0 ; i < 6 ; i++){
				para (inteiro j = 0 ; j < 4 ; j++){
					m1[i][j] = n1[i][j] + n2[i][j]
				}
			}
			para ( inteiro i = 0 ; i < 6 ; i++){
				para (inteiro j = 0 ; j < 4 ; j++){
					m2[i][j] = n1[i][j] - n2[i][j]
				}
			}
			para ( inteiro i = 0 ; i < 6 ; i++){
				para (inteiro j = 0 ; j < 4 ; j++){
					escreva("\n", m1[i][j])
				}
			}
			para ( inteiro i = 0 ; i < 6 ; i++){
				para (inteiro j = 0 ; j < 4 ; j++){
					escreva("\n", m2[i][j])
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 566; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */