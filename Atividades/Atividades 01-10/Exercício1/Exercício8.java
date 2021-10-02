package Exercício1;

import java.util.*;

public class Exercício8 {

	public static void main (String[] args) {

        Scanner leia = new Scanner(System.in);

        double custoFinal, custoDeFabrica;

        System.out.println("Digite o valor do carro: ");
        custoDeFabrica = leia.nextDouble();

        //foi somado o valor da porcentagem de 28% + 45% = 73%

        custoFinal = custoDeFabrica * 1.73;

        System.out.println("O valor do carro para o consumidor é: " + custoFinal);

        leia.close();
    }

}

