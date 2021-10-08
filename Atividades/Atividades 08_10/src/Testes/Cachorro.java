package Testes;

public class Cachorro extends Animal {

	public static void main(String[] args) {
		
    Animal cachorro = new Animal();
    
    cachorro.setNome("Dog");
    cachorro.setIdade(11);
    cachorro.setSom("latido");
    
    System.out.println("O nome do cachorro é: " + cachorro.getNome());
    System.out.println("A idade do cachorro é: " + cachorro.getIdade());
    System.out.println("O som que ele emite é um: " + cachorro.getSom());
    
    cachorro.Correr();
    cachorro.Descansar();
    
	}

}
