package Exercício_01;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Malcolm Silva");
		c1.setSexo("Masculino");
		c1.setIdade(23);
		
		System.out.println("O nome do cliente é: " + c1.getNome());
		System.out.println("O sexo do cliente é: " + c1.getSexo());
		System.out.println("A idade do cliente é: " + c1.getIdade());
		
		c1.Cadastrar();
		c1.SelecionarProduto();
		c1.FinalizarCompra();
		
	}

}
