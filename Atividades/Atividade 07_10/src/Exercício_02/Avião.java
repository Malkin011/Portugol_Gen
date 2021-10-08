package Exercício_02;

public class Avião {

	//Atributos/características
	private String nome;
	private String marca;
	private int ano;
	
	//metodos/funções
	
	void Decolar()
	{
		System.out.println("O Avião está decolando.");
	}
	
	void Voar()
	{
		System.out.println("O avião está voando no momento...");
	}
	
	void Pousar()
	{
		System.out.println("O avião está pousando!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
