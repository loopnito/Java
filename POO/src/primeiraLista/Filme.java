package primeiraLista;

public class Filme {
	String titulo;
	String genero;
	int duracao;
	void assistir() {
		System.out.println("Assistindo " + titulo);
	}
	void mostrarInformacoes() {
		System.out.println(titulo + genero + duracao);
	}
}
