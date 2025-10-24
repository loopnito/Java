package primeiraLista;

public class Gato {
	String nome;
	String raca;
	int idade;
	
	void miar() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome + ", está comendo.");
	}
	void mostrarInformacoes() {
		System.out.println(nome + " " + raca + ' ' + idade);
	}
}