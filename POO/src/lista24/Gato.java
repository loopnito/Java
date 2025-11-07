package lista24;

public class Gato extends Animal {
	private String cor;

	void setCor(String cor) {
		this.cor = cor;
	}
	
	void subirNoMuro() {
		System.out.println("O gato " + cor + " está em cima do muro.");
	}
}
