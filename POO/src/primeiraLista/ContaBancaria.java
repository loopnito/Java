package primeiraLista;

public class ContaBancaria {
	String titular;
	double saldo;
	
	void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Foram depositados " + valor);
	}
	void sacar(double valor ) {
		if (valor > saldo) {
			System.out.println("sem saldo suficiente");
		} else {
			saldo = saldo - valor;
			System.out.println("saldo suficiente");
		}
	}
	void mostrarSaldo() {
		System.out.println(saldo);
	}
}
