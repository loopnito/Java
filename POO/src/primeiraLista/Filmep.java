package primeiraLista;

import java.util.Scanner;

public class Filmep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Filme vg = new Filme();
		
		vg.titulo = "Fil";
		vg.genero = "Gen";
		vg.duracao  = 453;
		vg.assistir();
		vg.mostrarInformacoes();
		
		vg.titulo = "Gen";
		vg.genero = "Fil";
		vg.duracao  = 2521;
		vg.assistir();
		vg.mostrarInformacoes();
		
		System.out.println("FALE NOME");
		vg.titulo = scanner.next();
		System.out.println("Fale PRECO");
		vg.genero = scanner.next();
		System.out.println("Falar ESTOQUE?");
		vg.duracao  = scanner.nextInt();
		vg.assistir();
		vg.mostrarInformacoes();
	}
	
}
