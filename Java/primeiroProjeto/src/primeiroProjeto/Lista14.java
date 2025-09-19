package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1
		for(int ex1 = 1; ex1 <= 10; ex1 ++) {
			System.out.println(ex1);
		}
		//2
		int soma = 0;
		for(int ex2 = 1; ex2 <= 100; ex2++) {
			soma = ex2 + soma;
			System.out.println(soma);
		}
		//3
		for(int ex3 = 1; ex3 <= 20; ex3 ++) {
			if (ex3%2 == 0) {
				System.out.println(ex3);
			}
		}
		//4
		System.out.println("fale numero");
		int numero4 = scanner.nextInt();
		for(int ex4 = 1; ex4 <= 10; ex4 ++) {
			System.out.println(numero4 * ex4);
		}
		//5
		int num5 = 0;
		for(int ex5 = 1; ex5 <= 50; ex5 ++) {
			if (ex5%3 == 0) {
				num5 += 1;
			}
		}
		System.out.println(num5);
		//6
		System.out.println("fale um numero");
		int ex6num = scanner.nextInt();
		for(int ex6 = 1; ex6 <= ex6num; ex6 ++) {
			if (ex6%2 != 0) {
				System.out.println(ex6);
			}
		}
		//7
		System.out.println("infiorme valro");
		int numex7 = scanner.nextInt();
		for (int ex7 = 1; ex7 <= 5; ex7 ++) {
			int mult = 1;
			mult = mult * numex7;
			System.out.println(mult - 1);
			}
		
		//8
		for(int e=0;e<=10;e++) {
			System.out.println("Voce tem quantos anos de impresa: ");
			int idade = scanner.nextInt();
			if(idade >10) {
				System.out.println("Parabéns! Você irá receber um prêmio");
			}else {
				System.out.println("Quase lá");
			}

	}

}}
