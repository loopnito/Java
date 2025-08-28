package primeiroProjeto;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Qual é a sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Tem titulo de eleitor?");
		String resposta = scanner.next();
		if(idade >= 16 && resposta.equalsIgnoreCase("SIM")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Nuh uh.");
		}
		
		int numero;
		
		System.out.println("qual o valor da compra? ");
		double valor = scanner.nextDouble();
		System.out.println("é cliente VIP? ");
		boolean vip = scanner.nextBoolean();
		
		if(valor > 200 && vip == true) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("vai pagar: %.2f", valorFinal);
		} else {
			System.out.println("não tem desconto");
		}
		
		System.out.println("Digite sua idade");
		int idade1 = scanner.nextInt();
		System.out.println("Tem experiencia/");
		boolean experiencia = scanner.nextBoolean();
		if (idade1 >= 20 && idade1 <= 40 && experiencia == true) {
			System.out.println("aceiot");
		} else {
			System.out.println("Condenado a prisão perpetua.");
		}
	}

}
