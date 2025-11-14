package l25;

public class MainPadaria {

	public static void main(String[] args) {
		
		ProdutoPadaria p = new Pao();
		ProdutoPadaria b = new Bolo();
		ProdutoPadaria t = new Torta();
		ProdutoPadaria pp = new ProdutoPadaria();
		pp.preparar();
		p.preparar();
		b.preparar();
		t.preparar();
		
	}

}