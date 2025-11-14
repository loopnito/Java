package lista24;

public class VeiculoMain {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.setAno(2029);
		c.setMarca("Evil Marca");
		c.setPortas(93988);
		c.abrirPortaMalas();
		c.exibirInfo();
		c.abrirPortaMalas();
	}
	
}