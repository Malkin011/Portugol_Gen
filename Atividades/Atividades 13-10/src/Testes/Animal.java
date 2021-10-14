package Testes;

public abstract class Animal {

	private String nome;
	private int idade;
	private String som;
		
	// atributos 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
    
	// Exercícios 2 - Polimorfismo --> adicionar metodos de sons aos animais
	
}