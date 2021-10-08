package Testes;

public class Preguiça {

	public static void main(String[] args) {
		
		Animal preguica = new Animal();
		
		preguica.setNome("Malcolm");	
		preguica.setIdade(23);
		preguica.setSom("To com fome e talvez sono");
		
		System.out.println("O nome da preguiça é: " + preguica.getNome());
		System.out.println("A idade da preguiça é: " + preguica.getIdade());
		System.out.println("O som que a preguiça faz é: " + preguica.getSom());
		
		preguica.Descansar();
		preguica.SubirNaÁrvore();

	}

}
