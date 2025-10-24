package primeiraLista;

import java.util.Scanner;

public class VideoGameP {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VideoGame vg = new VideoGame();
		
		vg.marca = "Carne Misteriosa";
		vg.modelo = "Gigantesca";
		vg.ligado  = true;
		vg.ligar();
		vg.desligar();
		vg.verificarStatus();
		
		System.out.println("FALE MARCA");
		vg.marca = scanner.next();
		System.out.println("Fale MODELO");
		vg.modelo = scanner.next();
		System.out.println("Falar LIGADO? TRUE OU FALSE.");
		vg.ligado  = scanner.nextBoolean();
		vg.ligar();
		vg.desligar();
		vg.verificarStatus();
	}
}
