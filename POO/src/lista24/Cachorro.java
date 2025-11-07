package lista24;

public class Cachorro extends Animal {
	private String raca;

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	void abanarRabo() {
		System.out.println("O cachorro da raça " + raca + " esta abanando o rabo.");
	}
}