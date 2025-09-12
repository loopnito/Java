package primeiroProjeto;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Mostre os números de 10 a 30 no console.
		int ex1 = 10;
		while (ex1 <= 30) {
			System.out.println(ex1);
			ex1 += 1;
		}
		
		//TODO Peça 3 números inteiros ao usuário repetidamente usando um laço while. Some todos os números digitados e mostre o total.
		
		int ex2 = 1;
		int ex21;
		int ex22 = 0;
		while(ex2 <= 3) {
			System.out.println("Numero");
			ex21 = scanner.nextInt();
			ex22 += ex21;
			System.out.println(ex22);
			ex2 += 1;
		}
		
		//TODO Peça 5 números inteiros ao usuário repetidamente usando um laço while. Some todos os números digitados e mostre o total.
		
		int ex3 = 1;
		int ex31;
		int ex32 = 1;
		while(ex3 <= 5) {
			System.out.println("diga um numero");
			ex31 = scanner.nextInt();
			ex31 *= ex32;
			System.out.println(ex32);
			ex3 += 1;
		}
		//TODO Peça um número inteiro para o usuário e mostre a sequência numérica (começando no 1) até o número informado.
		
		System.out.println("numero");
		int ex4 = scanner.nextInt();
		int ex41 = 1;
		while (ex41 <= ex4) {
			System.out.println(ex41);
			ex41 += 1;
		}
		
		//TODO Escreva um programa que use um laço while para calcular e exibir a soma dos números de 1 a 5 (ou seja, 1 + 2 + 3 + 4 + 5).
		
		System.out.println("numero");
		int ex5 = scanner.nextInt();
		int ex51 = 1;
		while (ex51 <= 5) {
			ex5 += ex51;
			System.out.println(ex5);
			ex51 += 1;
		}
		
		//TODO Peça um número para o usuário e mostre a tabuada dele
		
		System.out.println("numero");
		int ex6 = scanner.nextInt();
		int ex61 = 1;
		int ex62;
		while (ex5 <= 10) {
			ex62 = ex6;
			System.out.println(ex62);
			ex5 += 1;
		}
	}

}
