package Exercício1;

import java.util.Scanner;

public class Exercício3 {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int segundos, horas, minutos;
	
	System.out.println("Informe a quantidade de segundos: ");
	segundos = leia.nextInt();
	System.out.println("Resultado em segundos: " + segundos);
	
	minutos = segundos / 60;
	System.out.println("Resultado em minutos: " + minutos);
	
	horas = segundos / 3600;
	System.out.println("Resultado em horas: " + horas);
	
	leia.close();
	
	}
	}

