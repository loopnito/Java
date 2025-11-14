package l25;

public class MainPagamento {

	public static void main(String[] args) {
		Pagamento p = new Pagamento();
		Pagamento px = new Pix();
		Pagamento c = new CartaoCredito();
		Pagamento d = new Dinheiro();
		
		p.processarPagamento();
		px.processarPagamento();
		c.processarPagamento();
		d.processarPagamento();
	}
	
}
