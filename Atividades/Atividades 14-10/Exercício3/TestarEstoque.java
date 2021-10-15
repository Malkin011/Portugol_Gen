package Exercício3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarEstoque {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	ArrayList<Estoque> estoque = new ArrayList<>();
	
	System.out.println(" || Olá, seja bem vindo... || ");
	System.out.println("\n || Selecione uma das opções a seguir... || ");
	
	System.out.println();
	System.out.println(" [1] Adicione Produtos \n [2] Remova Produtos \n [3] Atualize produtos");
	
	int op = leia.nextInt();
	String produto01 = "Maçã", produto02 = "Banana", produto03 = "Laranja", produto04 = "Uva", produto05 = "Limão";
	double preco01 = 3, preco02 = 2, preco03 = 4, preco04 = 7, preco05 = 5;
	
	estoque.add(new Estoque(produto01, preco01));
	estoque.add(new Estoque(produto02, preco02));
	estoque.add(new Estoque(produto03, preco03));
	estoque.add(new Estoque(produto04, preco04));
	estoque.add(new Estoque(produto05, preco05));
	
	System.out.println(" || Estoque atual || ");
	
	for(Estoque i : estoque) {
		System.out.println(i);
	}
	
	System.out.println();
	
	if (op == 1) {
		
		System.out.println(" Quantos produtos você vai adicionar? ");
		int quantProdutos = leia.nextInt();
		
		for(int i = 0; i < quantProdutos; i++);
		System.out.println(" Digite o nome do produto: ");
		String nome = leia.next();
		
		leia.next();
		
		System.out.println(" Digite o preço do Produto: ");
		double preco = leia.nextDouble();
		
		estoque.add(new Estoque(nome, preco));
	}
	
	System.out.println("\n || Estoque Atualizado || ");
	for(Estoque x : estoque) {
		System.out.println(x);
		
	}
    
	if (op == 2) {
		System.out.println(" || Digite a posição do Produto que deseja remover || ");
		int p = leia.nextInt();
		
		if (p == 1) {
			estoque.remove(0);
		}
		else if ( p == 2) {
			estoque.remove(1);
		}
		else if ( p == 3) {
			estoque.remove(2);
		}
		else if (p == 4) {
			estoque.remove(3);
		}
		else if (p == 5) {
			estoque.remove(4);
		}
		
		System.out.println(" || Seu estoque está atualizado || ");
		for(Estoque x : estoque) {
			System.out.println(x);
		}
	}
		if (op == 3) {
			
			System.out.println(" || Digite o produto que deseja atualizar || ");
			int at = leia.nextInt();
			
			System.out.println(" || Digite o novo valor do produto para atualizá-lo || ");
			double novo = leia.nextDouble();
			
			if(at == 1) {
				estoque.remove(0);
				estoque.add(new Estoque(produto01, novo));
			}
			
			else if (at == 2) {
				estoque.remove(1);
				estoque.add(new Estoque(produto02, novo));
			}
			
			else if (at == 3) {
				estoque.remove(3);
				estoque.add(new Estoque(produto03, novo));
			}
			
			else if (at == 4) {
				estoque.remove(4);
				estoque.add(new Estoque(produto04, novo));
			}
			
			else if (at == 5) {
				estoque.remove(5);
				estoque.add(new Estoque(produto05, novo));
			}
			
			System.out.println(" || Seu estoque foi atualizado || ");
			for (Estoque x : estoque) {
				System.out.println(x);
			}			
		}
			leia.close();
	
	}
}
