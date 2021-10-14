package Testes;

public class Preguiça extends Animal implements ViveEmMatas {

	private String SubirEmArvore;
	
	public String getSubirEmArvore() {
		return SubirEmArvore;
	}

	public void setSubirEmArvore(String subirEmArvore) {
		SubirEmArvore = subirEmArvore;
	}

	@Override
	public String ViveNaNatureza(String ViveNaNatureza) {
		// TODO Auto-generated method stub
		return ViveNaNatureza = "E ele vive na natureza...";
	}



}
