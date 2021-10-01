programa
{
	
	funcao inicio()
	{
		cadeia nome, resposta
		inteiro idade
          
		escreva ("Digite seu nome ")
		leia(nome)

		escreva ("Digite sua idade ")
		leia(idade)

		se (idade >= 18 e idade <= 60) {
				escreva ("\nOk " + nome + ", vamos prosseguir...\n\n ")
		} 
		
		senao se (idade >=16 e idade <18){
			escreva ("Hey, " + nome + ", você tem autorização? [ s | n ]: ")
			leia(resposta)
			
			se (resposta == "s" ou resposta == "S") {
				escreva("Legal, vamos prosseguir")
				}
			senao se (resposta == "n" ou resposta == "N"){
				escreva("Olá," + nome + ", volte quando conseguir sua autorização.")
				}

			senao se (idade < 18 e idade >= 0) { 
			escreva("Ops... não podemos prosseguir")
			}
	}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */