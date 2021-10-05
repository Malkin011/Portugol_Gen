package AtividadeJava;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		 System.out.println("\nDigite o 1 número: ");
		 n1 = ler.nextInt();
		 
		 System.out.println("\nDigite o 2 número: ");
		 n2 = ler.nextInt();
		 
		 System.out.println("\nDigite o 3 número: ");
		 n3 = ler.nextInt();
		 
		 if (n1 > n2 && n1 > n3) {
			 System.out.println("O número maior é: " + n1);
			 
		 }
		 else if (n2 > n1 && n2 > n3) {
			 System.out.println("O número maior é: " + n2);
			 
		 }
		 else if (n3 > n1 && n3 > n2) {
			 System.out.println("O número maior é: " + n3);
			 
		 }
	}

}
