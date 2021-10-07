package Exercícios;

public class Exemplo_1 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10];
		
		arrayVetor[5] = 2000;
		arrayVetor[9] = 6000;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Posição do valor: " + i + " | " + arrayVetor[i] + " valor");
			
		}

	}

}
