package l25;

public class MainPrato {
	
	public static void main(String[] args) {
		Prato pp = new Prato();
		Prato p = new Pizza();
		Prato l = new Lasanha();
		Prato s = new Salada();
		System.out.println("Prato comum: R$ " + pp.calcularPreco());
		System.out.println("Pizza: R$ " + p.calcularPreco());
		System.out.println("Lasanha: R$ " + l.calcularPreco());
		System.out.println("Salada: R$ " + s.calcularPreco());
	}
	
}
