package Testes;

public class Pregui�a {

	public static void main(String[] args) {
		
		Animal preguica = new Animal();
		
		preguica.setNome("Malcolm");	
		preguica.setIdade(23);
		preguica.setSom("To com fome e talvez sono");
		
		System.out.println("O nome da pregui�a �: " + preguica.getNome());
		System.out.println("A idade da pregui�a �: " + preguica.getIdade());
		System.out.println("O som que a pregui�a faz �: " + preguica.getSom());
		
		preguica.Descansar();
		preguica.SubirNa�rvore();

	}

}
