package l25;

public class MainConta {

	public static void main(String[] args) {
		Conta p = new ContaPoupanca();
		Conta i = new ContaInvestimento();
		Conta c = new Conta();
		
		System.out.println("Rendimento normal: R$ " + c.calcularRendimento(1000));
		System.out.println("Rendimento poupança: R$ " + p.calcularRendimento(1000));
		System.out.println("Rendimento investimento: R$ " + i.calcularRendimento(1000));
	}

}
