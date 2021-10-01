programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro A, B, C, D, R, S

		escreva ("Insira o número de A:")
		leia(A)

		escreva ("Insira o número de B:")
		leia(B)

		escreva ("Insira o número de C:")
		leia(C)

		R = mat.potencia((A + B), 2.0)
		S = mat.potencia((B + C), 2.0)
		
		D = (R + S)/2

		escreva("O valor de D é: " + D)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */