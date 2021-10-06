package Java;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int par = 0 , impar = 0 ; 
		
		for (int num, cont = 0 ; cont < 10 ; cont++) {
			System.out.println("Digite um número: ");
		    num = in.nextInt();
			
		    if (num % 2 == 0) {
				par++;
			}
		    else {
		    	impar++;
		    	}
		}
        System.out.println("Foram " +par+ " número pares e foram " +impar+ " número ímpares. ");
	}

}
