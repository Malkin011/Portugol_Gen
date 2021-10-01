programa
{
	
	funcao inicio()
	{
		real matriz[3][3], soma = 0.0, somaDiagonal = 0.0
		
		para (inteiro linha = 0; linha < 3; linha++){
			para (inteiro coluna = 0; coluna < 3; coluna++){
				escreva("\nPreencha o valor da casa: [", linha+1, "][" ,coluna+1, "]")
				leia(matriz[linha][coluna])
			}
		}
		limpa()
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				soma += matriz[linha][coluna]
			}
		}
		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				se (linha == coluna){
					somaDiagonal += matriz[linha][coluna]
					
				}
	          }
		}
		escreva("\nSoma de todos os valores: " +soma)
		escreva("\nSoma da diagnoal: " +somaDiagonal)
				
      }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */