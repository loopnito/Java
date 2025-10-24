package primeiraLista;

import java.util.Scanner;

public class GatoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gato gato = new Gato();
		
		gato.idade = 515;
		gato.nome = "Ele";
		gato.raca = "Ele";
		gato.miar();
		gato.comer();
		gato.mostrarInformacoes();
		
		System.out.println("FALE IDADE");
		gato.idade = scanner.nextInt();
		System.out.println("Fale nome");
		gato.nome = scanner.next();
		System.out.println("Falar RAÇA.");
		gato.raca = scanner.next();
		gato.miar();
		gato.comer();
		gato.mostrarInformacoes();
	}
}
