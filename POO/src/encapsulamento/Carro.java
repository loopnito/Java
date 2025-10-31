package encapsulamento;

public class Carro {

	private String modelo;
	private int ano;
	private int velocidadeAtual = 0;
	
	public int acelerar(int valor) {
		velocidadeAtual = velocidadeAtual + valor;
		return velocidadeAtual;
	}
	
	public int frear(int valor) {
		velocidadeAtual = velocidadeAtual - valor;
		if (velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
		return velocidadeAtual;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}	
}
