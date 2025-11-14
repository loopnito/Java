package l25;

public class ContaPoupanca extends Conta{
	@Override
	int calcularRendimento(int arg) {
		int resultado;
		resultado = (int) (arg * 0.2);
		return resultado;
	}
}
