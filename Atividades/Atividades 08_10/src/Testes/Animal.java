package Testes;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	
	void Correr()
	{
		System.out.println("\nO " + nome + " est· correndo...");
	}
	 void SubirNa¡rvore()
	 {
		 System.out.println("\nO " + nome + " est· subindo na ·rvore...");
	 }
	void Descansar()
	{
		System.out.println("\nO " + nome + " est· descansando...");
	}
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
}
