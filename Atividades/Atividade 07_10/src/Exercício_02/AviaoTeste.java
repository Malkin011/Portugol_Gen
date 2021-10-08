package Exercício_02;

public class AviaoTeste {

	public static void main(String[] args) {
		
    Avião belo = new Avião();
    
    belo.setNome("FÊNIX");
    belo.setMarca("GOL");
    belo.setAno(2019);
    
    System.out.println("O nome do avião é: " + belo.getNome());
    System.out.println("A marca deste avião é: " + belo.getMarca());
    System.out.println("O ano de fabricação deste avião é: " + belo.getAno());
    
    belo.Decolar();
    belo.Voar();
    belo.Pousar();
    
	}

}
