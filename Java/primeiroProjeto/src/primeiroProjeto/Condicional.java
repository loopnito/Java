package primeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
/* >= maior ou igual   <= menor ou igual
 * > maior             < menor
 * == igual            != diferente */
		
		
		int idade = 18;
		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}
		
		Scanner scanner = new Scanner(System.in);
		//verificação de desconto
		System.out.println("Quanto você pagou? ");
		double valor = scanner.nextDouble();
		if(valor >= 200) {
			System.out.println("Você ganhou desconto");
		} else {
			System.out.println("Você não ganhou desconto");
		}
		
//--------------------------------------
		String continuar;
		System.out.println("Deseja continuar? ");
		continuar = scanner.nextLine();
		if(continuar == "sim") {
			System.out.println("Você escolheu continuar");
		} else {
			System.out.println("Você escolheu sair");
		}
		
		System.out.print("Olá ");
		System.out.print("mundo");
		
	}

}
