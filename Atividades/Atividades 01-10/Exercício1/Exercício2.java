package Exerc�cio1;

import java.util.*;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o n�mero de dias totais ");
		int dias = leia.nextInt();
		
		int ano = dias / 365;
		int mes = (dias % 365)/ 30;
		int dia = (dias % 365) % 30;
		
		System.out.println("Sua Data de nascimento �: " +dia+ "/" +mes+ "/" +(2021 - ano));
		leia.close();
		
		
	    
	}
}
