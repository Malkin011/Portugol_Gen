package Java;

import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, contador21 = 0 , contador50 = 0;
		
        System.out.println("\nDigite a idade: ");
		idade = entrada.nextInt();
		
		while (idade != -99 && idade != 0) {
			if (idade <=21) {
				contador21++;
				}
			
			if (idade >=50) {
				contador50++;
				
			}
			
			System.out.println("\nDigite a idade -> (Para encerrar, digite -99");
			idade = entrada.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + contador21);
		System.out.println("Total de pessoas com mais de 50 anos: " + contador50);
		
	}

}
