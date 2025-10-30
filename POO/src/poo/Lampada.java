package poo;

public class Lampada {
	boolean ligada = false;
	void mudar() {
		ligada = !ligada;
		if (ligada) {
			System.out.println("A lampada esta ligada.");
		} else {
			System.out.println("A lampada esta desligada.");
		}
	}
	void verStatus() {
		if (ligada) {
			System.out.println("A lampada esta ligada.");
		} else {
			System.out.println("A lampada esta desligada.");
		}
	}
}
