package Exerc�cio_02;

public class AviaoTeste {

	public static void main(String[] args) {
		
    Avi�o belo = new Avi�o();
    
    belo.setNome("F�NIX");
    belo.setMarca("GOL");
    belo.setAno(2019);
    
    System.out.println("O nome do avi�o �: " + belo.getNome());
    System.out.println("A marca deste avi�o �: " + belo.getMarca());
    System.out.println("O ano de fabrica��o deste avi�o �: " + belo.getAno());
    
    belo.Decolar();
    belo.Voar();
    belo.Pousar();
    
	}

}
