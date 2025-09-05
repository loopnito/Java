package primeiroProjeto;

import java.util.Scanner;

public class Lista09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int ex1 = 1;
		while (ex1 <= 10) {
			System.out.println(ex1);
			ex1 += 1;
		}
		
		int ex2 = 10;
		while (ex2 >= 1) {
			System.out.println(ex2);
			ex2 -= 1;
		}
		
		int ex3 = 0;
		while (ex3 <= 100) {
			System.out.println(ex3);
			ex3 += 5;
		}
		
		int ex4 = 1;
		while (ex4 <= 5) {
			System.out.println("Eu gosto de Java");
			ex4 += 1;
		}
		
		int contagem2 = 1;
		int somativa;
		int somativa2 = 0;
		while (contagem2 <=5) {
			System.out.println("digite um numero: ");
		somativa = scanner.nextInt();
			somativa2 = somativa + somativa2;
			System.out.println(somativa2);
			contagem2 ++;
		}
		
		System.out.println("digite sair para sair do sistema");
		String ex6 = scanner.next();
		while(!ex6.equalsIgnoreCase("sair")) {
			System.out.println("tente novamente");
			ex6 = scanner.next();
		System.out.println("você conseguiu sair");
		}
		
		int ex7 = scanner.nextInt();
		while (ex7 >= 1) {
			System.out.println(ex7);
			ex7 -= 1;
		}
}}
