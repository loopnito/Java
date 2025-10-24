package primeiraLista;

import java.util.Scanner;

public class ProdutoP {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produto vg = new Produto();
		
		vg.nome = "Produto";
		vg.preco = 2.99;
		vg.estoque  = 98873;
		vg.vender(32);
		vg.mostrarInformacoes();
		
		System.out.println("FALE NOME");
		vg.nome = scanner.next();
		System.out.println("Fale PRECO");
		vg.preco = scanner.nextDouble();
		System.out.println("Falar ESTOQUE?");
		vg.estoque  = scanner.nextInt();
		System.out.println("VENDER quanto?");
		vg.vender(scanner.nextInt());
		vg.mostrarInformacoes();
	}
}
