programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4
		
		escreva("Informe o primeiro número\n")
		leia(num1)

		escreva ("Informe o segundo número\n")
		leia(num2)

		escreva("Informe o terceiro número\n")
		leia(num3)

		escreva("Informe o quarto número \n")
		leia (num4)

		num1 = mat.potencia(num1, 2.0)
		num2 = mat.potencia(num2, 2.0)
		num3 = mat.potencia(num3, 2.0)
		num4 = mat.potencia(num4, 2.0)

		se (num3 >= 1000){
			escreva("seu resultado é " + num3)
		}
		senao 
		escreva("Os números informados são: "  + num1 + ", " + num2 + ", " + num3 + " e " + num4)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */