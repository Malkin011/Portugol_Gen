programa
{
	
	funcao inicio()
	{
		escreva("Olá Mundo")
	// Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias
inteiro dias, meses, ano
inteiro diaNascimento, mesNascimento, anoNascimento
inteiro totalDias
escreva ("digite o dia de hoje:\n")
 leia (dias)
 escreva ("agora o mês atual:\n")
 leia (meses)
 escreva ("por fim o ano atual:\n")
 leia (ano)
 

 escreva ("Informe a dia do seu aniversário:\n ")
 leia (diaNascimento)
 escreva ("Informe o mês do seu aniversário:\n ")
 leia (mesNascimento)
 escreva ("Informe o ano do seu aniversário:\n ")
 leia (anoNascimento)

 totalDias = (ano - anoNascimento) * 365 + (meses * 30 + dias) - (mesNascimento * 30 + diaNascimento) 
 escreva ("sua idade em dias é:" + totalDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 751; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */