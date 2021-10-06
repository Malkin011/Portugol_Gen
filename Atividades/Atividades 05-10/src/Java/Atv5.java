package Java;

import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num = 0, soma = 0;
				
        do { 
        System.out.println("Informe um número para somar, Digite 0 para finalizar: ");
        
        num = leia.nextInt();
        soma += num;
        
        }
        while (num !=0);
        System.out.println("A soma de todos os números é: " + soma);

        leia.close();
}
}