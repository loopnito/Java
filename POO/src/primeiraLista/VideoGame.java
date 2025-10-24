package primeiraLista;

public class VideoGame {
	String marca;
	String modelo;
	boolean ligado;
	void ligar() {
		ligado = true;
		System.out.println("console ligado");
	}
	void desligar() {
		ligado = false;
		System.out.println("Console desligado");
	}
	void verificarStatus() {
		if (ligado) {
			System.out.println("O sistema esta ligado.");
		} else {
			System.out.println("O sistema esta desligado.");
		}
	}
}
