package Exerc�cio_03;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		
	ProdutoEletr�nico Dell = new ProdutoEletr�nico();
	
	Dell.setNome("Notbook");
	Dell.setMarca("DELL");
	Dell.setLancamento(2019);
	
	System.out.println("O Tipo de produto �: " + Dell.getNome());
	System.out.println("A Marca do " + Dell.getNome() + " �: " + Dell.getMarca());
	System.out.println("O ano de lan�amento do produto �: " + Dell.getLancamento());
	
	Dell.Ligar();
	Dell.Executar();
	Dell.Desligar();
	
	

	}

}
