package Testes;

public class Cavalo {

	public static void main(String[] args) {
		Animal cavalo = new Animal();
		
		cavalo.setNome("Jean");
		cavalo.setIdade(11);
		cavalo.setSom("Relinchar");
		
		System.out.println("O nome do cavalo �: " + cavalo.getNome());
		System.out.println("A idade do cavalo �: " + cavalo.getIdade());
		System.out.println("O som que o cavalo emite �: " + cavalo.getSom());
		
		cavalo.Correr();
		cavalo.Descansar();

	}

}
