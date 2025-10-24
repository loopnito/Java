package primeiraLista;

import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancaria vg = new ContaBancaria();
		
		vg.titular = "Hoebort";
		vg.saldo = 999.99;

		vg.depositar(0.99);
		vg.sacar(999.98);
		vg.mostrarSaldo();
		
		System.out.println("FALE NOME");
		vg.titular = scanner.next();
		System.out.println("Fale SALDO");
		vg.saldo = scanner.nextDouble();
		System.out.println("DEPOSITAR QUANTO?");
		vg.depositar(scanner.nextDouble());
		System.out.println("SACAR QUANTO");
		vg.sacar(scanner.nextDouble());
		vg.mostrarSaldo();
	}
}
