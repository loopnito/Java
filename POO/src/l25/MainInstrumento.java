package l25;

public class MainInstrumento {
	
	public static void main(String[] args) {
		Instrumento i = new Instrumento();
		Instrumento v = new Violao();
		Instrumento b = new Bateria();
		Instrumento p = new Piano();
		
		i.tocar();
		v.tocar();
		b.tocar();
		p.tocar();
	}
	
}
