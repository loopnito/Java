package primeiraLista;
import java.util.Scanner;

public class MusicaP {

	public static void main(String[] args) {
		Musica ms = new Musica();
		Scanner sc = new Scanner(System.in);
		
		ms.titulo = "Musoca";
		ms.artista = "Artosta";
		ms.duracao = 989358;
		ms.tocar();
		ms.pausar();
		ms.mostrarDetalhes();
		
		System.out.println("titulo");
		ms.titulo = sc.next();
		System.out.println("artista");
		ms.artista = sc.next();
		System.out.println("duraão");
		ms.duracao = sc.nextInt();
		ms.tocar();
		ms.pausar();
		ms.mostrarDetalhes();
	}
}
