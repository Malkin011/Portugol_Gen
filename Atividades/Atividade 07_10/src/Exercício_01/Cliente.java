package Exercício_01;

public class Cliente {

	 //Atributos privador
    private String nome;
    private String sexo;
    private int idade;


    //metodos - funções - funcionalidades
    void Cadastrar() 
    {
        System.out.println("\nNo momento, o cliente está se cadastrando...");
    }

    void SelecionarProduto() 

    {
        System.out.println("\nO cliente está escolhendo o produto...");
    }

    void FinalizarCompra() 
    {
        System.out.println("\nO cliente comprando o produto....");
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	} 
    
}
