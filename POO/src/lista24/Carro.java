package lista24;

public class Carro extends Veiculo {
	private int portas;
	boolean aberta;
	
	void abrirPortaMalas() {
		aberta = !aberta;
		if (aberta) {
			System.out.println("Porta malas foi fechado.");
		} else {
			System.out.println("Porta malas foi aberto.");
		}
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}
}
