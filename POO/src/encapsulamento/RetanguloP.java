package encapsulamento;

public class RetanguloP {
	
	public static void main(String[] args) {
		
		Retangulo rtg = new Retangulo();
		rtg.setAltura(932);
		rtg.setLargura(28874);
		System.out.println("Area: " + rtg.calcArea() + "\r\nPerimetro: " + rtg.calcPeri());
		
	}
	
}
