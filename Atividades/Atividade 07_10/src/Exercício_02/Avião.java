package Exerc�cio_02;

public class Avi�o {

	//Atributos/caracter�sticas
	private String nome;
	private String marca;
	private int ano;
	
	//metodos/fun��es
	
	void Decolar()
	{
		System.out.println("O Avi�o est� decolando.");
	}
	
	void Voar()
	{
		System.out.println("O avi�o est� voando no momento...");
	}
	
	void Pousar()
	{
		System.out.println("O avi�o est� pousando!");
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
