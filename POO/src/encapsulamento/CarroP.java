package encapsulamento;

public class CarroP {

	public static void main(String[] args) {
		Carro cr = new Carro();
		cr.acelerar(29328);
		System.out.println("O carro esta com a velocidade: " + cr.getVelocidadeAtual());
		cr.frear(948219457);
		System.out.println("O carro esta com a velocidade: " + cr.getVelocidadeAtual());
	}

}
