package Exercícios;

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
		
Scanner leia =  new  Scanner ( System.in);
		
int m[][] = new int[3][3];
int l, c, somaT =0, somaD=0;

Scanner entrada = new Scanner(System.in);

for (l =0; l<3;l++){
    for(c = 0; c < 3; c++){
        System.out.printf("Posição: [ " +l+ " ][ " +c+ " ]: " );
        m[l][c]= entrada.nextInt();
        }
}

for (l =0; l<3;l++){
    for(c = 0; c < 3; c++){
        somaT += m[l][c];
        if (l == c){
        somaD += m[l][c];
        }
    }
}        

for (l = 0; l< 3; l++){
    for (c = 0; c < 3; c++){    
    System.out.printf("[ "+ m[l][c] + " ]");
    }
    System.out.println();
}
System.out.println("\nA soma total é: " +somaT);
System.out.println("A soma da diagonal é: " +somaD);



}
}
