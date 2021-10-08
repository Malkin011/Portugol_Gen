package Testes;

public class Cavalo {

	public static void main(String[] args) {
		Animal cavalo = new Animal();
		
		cavalo.setNome("Jean");
		cavalo.setIdade(11);
		cavalo.setSom("Relinchar");
		
		System.out.println("O nome do cavalo é: " + cavalo.getNome());
		System.out.println("A idade do cavalo é: " + cavalo.getIdade());
		System.out.println("O som que o cavalo emite é: " + cavalo.getSom());
		
		cavalo.Correr();
		cavalo.Descansar();

	}

}
