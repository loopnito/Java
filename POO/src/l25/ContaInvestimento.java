package l25;

public class ContaInvestimento extends Conta{
	@Override
	int calcularRendimento(int arg) {
		int resultado;
		resultado = (int) (arg * 999.99);
		return resultado;
	}
}
