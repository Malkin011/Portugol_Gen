programa
{
	
	funcao inicio()
	{
		real pontuacao [5]
		real maiorNota = 0.0

		para(inteiro contagem = 0; contagem < 5; contagem++){
			escreva("\nDigite a ", contagem+1, "° nota: ")
                     leia(pontuacao[contagem])
               
               se (pontuacao[contagem] > maiorNota){
               	maiorNota = pontuacao[contagem]
               }
	
		}
          limpa ()
          
		para(inteiro contagem = 0; contagem < 5; contagem ++){
			escreva("\nA ", contagem+1, "° nota é: "+pontuacao[contagem])
		}
		escreva ("\nA maior pontuação é: "+maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */