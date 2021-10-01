programa
{
	// tabuada  teste 
	
	funcao inicio()
	{
	inteiro contador, cont = 0 , resultado, numero, opc = 0
	
	escreva ("Digite um número: ")
	leia(numero)
	
	enquanto (opc != 2) {
		escreva( "\n[1] Criar novamente\n [2] Sair do Sistema \n Opção: ")
		leia(opc)

		se (opc == 1) {
			escreva ("Digite um número: ")
			leia (numero)

			limpa ()

			para (contador = 1; contador <= 10; contador++){
		
	      resultado = numero * contador

		 escreva ("\n", numero + " X " + contador + " = " + resultado)
		}
	}
	senao se (opc ==2) 	{
		limpa ()
		escreva ("\n ...sistema sendo encerrado	...")
		escreva ("\n     Sistema encerrado")
		cont = 2
	}

	senao {
		limpa ()
		escreva("\n Opção inválida!")
		
	}
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 202; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */