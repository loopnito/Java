package encapsulamento;

public class ContaBancariaP {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setTitular("Ele.");
		conta.depositar(500.00);
		System.out.println("Titular: "+conta.getTitular());
		System.out.println("Saldo: "+ conta.getSaldo());
		conta.sacar(200);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.depositar(40285274283284273524.92);
		System.out.println("Saldo: " + conta.getSaldo());
	}
	
}
