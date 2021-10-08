package Exercício_03;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		
	ProdutoEletrônico Dell = new ProdutoEletrônico();
	
	Dell.setNome("Notbook");
	Dell.setMarca("DELL");
	Dell.setLancamento(2019);
	
	System.out.println("O Tipo de produto é: " + Dell.getNome());
	System.out.println("A Marca do " + Dell.getNome() + " é: " + Dell.getMarca());
	System.out.println("O ano de lançamento do produto é: " + Dell.getLancamento());
	
	Dell.Ligar();
	Dell.Executar();
	Dell.Desligar();
	
	

	}

}
