package Testes;

public class Cavalo extends Animal implements AnimaisDomesticados {

	private String correr;
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	@Override
	public String VivemComHumanos(String VivemComHumanos) {
		
		return VivemComHumanos = "E ele convive com humanos...";
	}
}
