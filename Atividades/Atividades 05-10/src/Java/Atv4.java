package Java;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		
    Scanner leia = new Scanner(System.in);
    
    int idade, sexo, outraCalma = 0, pessoaCalma = 0, pessoaCalmaMenor = 0, mulherNervosa = 0, pessoas = 0, pessoaNervosa = 0, homemAgressivo = 0, caracteristica;
    
    while (pessoas <2)
    {
    	System.out.println("Qual � a sua idade? ");
    	idade = leia.nextInt();
    	System.out.println("Informe seu sexo: ( 1- Feminino / 2- Masculino / 3- Outros" );
    	sexo = leia.nextInt();
    	System.out.println("Informe as caracter�sticas psicologicas: ( 1- Calmo / 2- Nervoso / 3- Agressivo )");
    	caracteristica = leia.nextInt();
    	
    	if (caracteristica == 1)
    	{
    		pessoaCalma++;
    	}
    	if (sexo == 1 && caracteristica == 2)
    	{
    		mulherNervosa++;
    	}
    	if (sexo == 2 && caracteristica == 3)
    	{
    		homemAgressivo++;
    	}
    	if (sexo == 3 && caracteristica == 1)
    	{
    		outraCalma++;
    	}
        if (idade >= 40 && caracteristica == 2)
    {
    	pessoaNervosa++;
    	
    }
        if (idade < 18 && caracteristica == 1)
        {
        	pessoaCalmaMenor++;
        	     	
        }
        
        pessoas++;
	}
	    System.out.println("O n�mero de pessoas calmas �: " + pessoaCalma);
	    System.out.println("O n�mero de mulheres nervosas �: " + mulherNervosa);
	    System.out.println("O n�mero de homens agressivos �: " + homemAgressivo);
	    System.out.println("O n�mero de outros calmos �: " + outraCalma);
	    System.out.println("O n�mero de pessoas nervosas com mais e 40 anos �: " + pessoaNervosa);
	    System.out.println("O N�mero de pessoas calmas menor de idade �: " + pessoaCalmaMenor);
	    
	    

}
}
