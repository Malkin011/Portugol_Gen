package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio_01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] arrayVetor = new int[5];
		int maiorNota = 0;
		
 		/*arrayVetor[0] = 10;
		arrayVetor[1] = 20;
		arrayVetor[2] = 30;
		arrayVetor[3] = 40;
		arrayVetor[4] = 50;*/
		
		for (int i = 0; i < arrayVetor.length; i++) {
			System.out.println("Digite um valor: ");
			arrayVetor[i] = entrada.nextInt();
			}
		
		for(int i = 0; i < arrayVetor.length; i++) {
			System.out.println("A posi��o do valor �: " + i + " | " + arrayVetor[i] + " � o valor dentro dessa posi��o");
			
		    if (maiorNota < arrayVetor [i]) {
		    	maiorNota = arrayVetor [i];
		    }
		}
        System.out.println("Sua maior nota �: " +maiorNota);
	}
        
	}


