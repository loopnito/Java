package encapsulamento;

public class Avaliacao {

	private String nome;
	private int nota1 = 0;
	private int nota2 = 0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		if (nota1 >= 0) {
			this.nota1 = nota1;
		} else {
			System.out.println("Idade invalida.");
		}
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		if (nota2 >= 0) {
			this.nota2 = nota2;
		} else {
			System.out.println("Idade invalida.");
		}
	}
	
	public int media() {
		int result = (nota2 + nota1) / 2;
		if (result > 10) {
			result = 10;
			System.out.println("Resultado maior do que 10");
		} else if (result < 0) {
			result = 0;
			System.out.println("Resultado menor do que 0");
		}
		return result;
	}
}
