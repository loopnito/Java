package encapsulamento;

public class Retangulo {
	private int largura;
	private int altura;
	
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcArea() {
		int result = largura * altura;
		return result;
	}
	
	public int calcPeri() {
		int result = largura + altura;
		return result;
	}
}
