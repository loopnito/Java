package l25;

public class Pix extends Pagamento {
	@Override
	void processarPagamento() {
		System.out.println("Pagamento via PIX concluído.");
	}
}
