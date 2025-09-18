package primeiroProjeto;

import java.util.Scanner;

public class Lista12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//1
		int ex1 = 10;
		do {
			System.out.println(ex1);
			ex1 += 1;
		} while (ex1 <= 30);
		
		//2
		System.out.println("fala um numero ai");
		int ex2 = scanner.nextInt();
		do {
			System.out.println("fala denovo");
			ex2 = scanner.nextInt();
		} while (ex2 != 5);	
		System.out.println("adivinhei é 5");
		
		//3
		System.out.println("fale peso");
		int ex3 = scanner.nextInt();
		do {
			System.out.println("peso excedido tene novamente");
			ex3 = scanner.nextInt();
		} while (ex3 > 23);
		System.out.println("aceito");
		
		//4
		System.out.println("fale livro");
		int ex4 = scanner.nextInt();
		int dias = 0;
		int somatoria = 0;
		do {
			dias += 1;
			somatoria += ex4;
			System.out.println("fale livro novamente");
			ex4 = scanner.nextInt();
		} while (dias < 7);
		System.out.println(somatoria);
		
		//5
		System.out.println("fale codigo");
		int ex5 = scanner.nextInt();
		do {
			System.out.println("ta incorreto issai");
			ex5 = scanner.nextInt();
		} while (ex5 != 789);
		System.out.println("ta correto isso ai");
		
		//6
		System.out.println("fale litros");
		int ex6 = scanner.nextInt();
		do {
			System.out.println("ta suficiente n pae");
			ex6 = scanner.nextInt();
		} while (ex6 <= 10);
		System.out.println("ta suficinetie");
		
		//7
		System.out.println("fale quilometros");
		int ex7 = scanner.nextInt();
		int somatoria1 = 0;
		do {
			somatoria1 += ex7;
			System.out.println("novamente");
			ex4 = scanner.nextInt();
		} while (ex7 > 0);
		System.out.println(somatoria1);
	}

}
