package Exerc�cio_03;

public class ProdutoEletr�nico {

	private String nome;
	private String marca;
	private int lancamento;
	
	void Ligar()
	{
		System.out.println("O Computador est� ligando!");
	}
	
	void Executar()
	{
		System.out.println("O computador est� executando o sistema");
	}
	
	void Desligar()
	{
		System.out.println("O computador est� sendo desligado");
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

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
}
