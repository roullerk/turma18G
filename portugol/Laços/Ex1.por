programa
{
	
	funcao inicio()
	{
		inteiro hab
		inteiro filho=0 , totalf= 0, i =1
		real sal = 0, medsal, medfil, maisal=0 , percsal=0, totalsal=0,  totalper

			para (hab = 1 ; hab <= 20 ; hab++) {
				escreva (" Quantos filhos você tem ? ")
				leia(filho)
				escreva (" Digite seu salário : ")
				leia(sal)
				totalf += filho
				totalsal += sal
				se (maisal < sal ) {
					maisal = sal
				}
				se ( sal <= 100) {
			  	percsal = percsal + 1
              

				}
				
			}
		 	medfil = totalf / 20
		 	medsal = totalsal /20
		 	totalper = (percsal * 100) / 20
		 	escreva ("\nA média de filhos da população é : " , medfil)
		 	escreva("\nA média do salário da população é : " , medsal)
		 	escreva("\nO maior salário da população é : ", maisal)
			escreva("\nA porcentagem do salário da população até 100 reais é : ", totalper)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */