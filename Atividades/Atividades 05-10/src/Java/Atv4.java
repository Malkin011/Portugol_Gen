package Java;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		
    Scanner leia = new Scanner(System.in);
    
    int idade, sexo, outraCalma = 0, pessoaCalma = 0, pessoaCalmaMenor = 0, mulherNervosa = 0, pessoas = 0, pessoaNervosa = 0, homemAgressivo = 0, caracteristica;
    
    while (pessoas <2)
    {
    	System.out.println("Qual é a sua idade? ");
    	idade = leia.nextInt();
    	System.out.println("Informe seu sexo: ( 1- Feminino / 2- Masculino / 3- Outros" );
    	sexo = leia.nextInt();
    	System.out.println("Informe as características psicologicas: ( 1- Calmo / 2- Nervoso / 3- Agressivo )");
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
	    System.out.println("O número de pessoas calmas é: " + pessoaCalma);
	    System.out.println("O número de mulheres nervosas é: " + mulherNervosa);
	    System.out.println("O número de homens agressivos é: " + homemAgressivo);
	    System.out.println("O número de outros calmos é: " + outraCalma);
	    System.out.println("O número de pessoas nervosas com mais e 40 anos é: " + pessoaNervosa);
	    System.out.println("O Número de pessoas calmas menor de idade é: " + pessoaCalmaMenor);
	    
	    

}
}
