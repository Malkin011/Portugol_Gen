package Java;

import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0, cont = 0, media = 0;
		
        do { System.out.println("Informe um n�mero! Para finalizar, digite 0: ");
        num = leia.nextInt();
        
        if (num % 3 == 0 && num != 0) {
        	soma += num;      
        cont++;
        }
        
        } while (num != 0);
        media = soma / cont;
        System.out.println("Sua m�dia de multiplos de 3 �: " + media);
        
        leia.close();
        
	}

}
