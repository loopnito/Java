package primeiraLista;

public class Produto {
	String nome;
	double preco;
	int estoque;
	
	void vender(int quantidade) {
		if (quantidade < estoque) {
			System.out.println("n da n chefe");
		} else {
			System.out.println("da sim chefe :D");
			estoque = estoque - quantidade;
		}
	}
	void mostrarInformacoes() {
		System.out.println(nome + preco + estoque);
	}
}
