programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	inteiro peso, excesso, multa

	escreva("Informe o peso do tomate")
	leia(peso)

	excesso = peso - 50
	se (excesso <= 0)
	escreva("\n Não há multas para você pagar")

	senao se (excesso > 0){
		multa = excesso * 4 
		escreva("\nO seu excesso é:" + excesso + " e sua multa é de:" + multa + ",00 Reais")
		
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */