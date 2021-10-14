package Testes;

public class TestarAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo ();
		Preguiça preguica = new Preguiça();
		
		cachorro.setNome("Dog");
		cachorro.setIdade(13);
		cachorro.setSom("Auau");
		cachorro.setCorrer(cachorro.getNome() + " está correndo...");
		
		cavalo.setNome("Jean");
		cavalo.setIdade(12);
		cavalo.setSom("IIIIIIIIIRRRRRRIIIIII");
		cavalo.setCorrer(cavalo.getNome() + " está correndo...");
		
		preguica.setNome("Victor Ferraz");
		preguica.setIdade(11);
		preguica.setSom("grrrr");
		preguica.setSubirEmArvore(preguica.getNome() + " está subindo na árvore...");
		
		System.out.println("O " + cachorro.getNome()+ " tem " + cachorro.getIdade() + " anos, " + "faz " + cachorro.getSom() + " e " + cachorro.getCorrer());
		System.out.println(cachorro.VivemComHumanos(null));
		System.out.println("O " + cavalo.getNome() + " tem " + cavalo.getIdade() + " anos, " + "faz " + cavalo.getSom() + " e " + cavalo.getCorrer());
		System.out.println(cavalo.VivemComHumanos(null));
		System.out.println("A " + preguica.getNome() + " tem " + preguica.getIdade() + " anos," + " faz " + preguica.getSom() + " e " + preguica.getSubirEmArvore());
		System.out.println(preguica.ViveNaNatureza(null));
		
	
	}

}
