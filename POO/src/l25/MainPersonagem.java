package l25;

public class MainPersonagem {

	public static void main(String[] args) {
		
		Personagem g = new Guerreiro();
		Personagem m = new Mago();
		Personagem c = new Curandeiro();
		Personagem p = new Personagem();
		g.realizarAcao();
		m.realizarAcao();
		c.realizarAcao();
		p.realizarAcao();
	}
	
}