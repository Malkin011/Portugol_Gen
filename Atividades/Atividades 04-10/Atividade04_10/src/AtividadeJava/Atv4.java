package AtividadeJava;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
    double num;
    
    System.out.println("Digite um n�mero: ");
    num = ler.nextDouble();
    
    if (num % 2 == 0.0) {
    	System.out.println("Este n�mero � par.");
    	System.out.println("A ra�z ser�: " + Math.sqrt(num));
    	}
    else {
    	System.out.println(num + ": Este n�mero � impar.");
    	System.out.println(num + ": O n�mero elevado ao quadrado �: " + Math.pow(num, 2));
    }
    
    
    
	}

}
