programa
{
	
	funcao inicio()
	{
		real N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		// Pergunta: 
		
          // N1
		para (inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("\nDigite o valor da posição linha" ,linha+1, " coluna" ,coluna+1, " para N1: ")
				leia(N1[linha][coluna])
			}
		}
		// N2
		para (inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("\nDigite o valor da posição linha" ,linha+1, " coluna" ,coluna+1, " para N2: ")
				leia(N2[linha][coluna])
			}
		}
		// Adicionando o N1 ao N2
		para (inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				
			}
	}
	     // Subtraindo  o N1 do N2
	     escreva("\n")
	     
	     para (inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				escreva("["+M2[linha][coluna]+"]")
				
			}
			escreva("\n")
			
	     }
	}


				
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 845; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */