package encapsulamento;

public class ProdutoP {
	
	public static void main(String[] args) {
		
		Produto pdt = new Produto();
		pdt.setNome("Fone de Ouvido SonicBass Pro");
		pdt.setPreco(249.90);
		pdt.setEstoque(35);
		System.out.println("Nome do produto: " + pdt.getNome() + "\r\n Preço: " + pdt.getPreco() + "\r\n Estoque: " + pdt.getEstoque());
		pdt.setNome("Câmera Compacta Lumina X200");
		pdt.setPreco(129900.90);
		pdt.setEstoque(12);
		System.out.println("Nome do produto: " + pdt.getNome() + "\r\n Preço: " + pdt.getPreco() + "\r\n Estoque: " + pdt.getEstoque());
		pdt.setNome("Mochila TechTraveler 45L");
		pdt.setPreco(389.50);
		pdt.setEstoque(58);
		System.out.println("Nome do produto: " + pdt.getNome() + "\r\n Preço: " + pdt.getPreco() + "\r\n Estoque: " + pdt.getEstoque());
	}

}
