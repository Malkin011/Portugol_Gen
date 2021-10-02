package Exercício1;

import java.util.*;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o número de dias totais ");
		int dias = leia.nextInt();
		
		int ano = dias / 365;
		int mes = (dias % 365)/ 30;
		int dia = (dias % 365) % 30;
		
		System.out.println("Sua Data de nascimento é: " +dia+ "/" +mes+ "/" +(2021 - ano));
		leia.close();
		
		
	    
	}
}
