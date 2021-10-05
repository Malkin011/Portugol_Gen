package AtividadeJava;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
    double num;
    
    System.out.println("Digite um número: ");
    num = ler.nextDouble();
    
    if (num % 2 == 0.0) {
    	System.out.println("Este número é par.");
    	System.out.println("A raíz será: " + Math.sqrt(num));
    	}
    else {
    	System.out.println(num + ": Este número é impar.");
    	System.out.println(num + ": O número elevado ao quadrado é: " + Math.pow(num, 2));
    }
    
    
    
	}

}
