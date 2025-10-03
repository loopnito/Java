package primeiroProjeto;

import java.util.Scanner;

public class Lista19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int ex1 = scanner.nextInt();
		ex1(ex1);
		int ex2 = scanner.nextInt();
		ex2(ex2);
		String ex3 = scanner.next();
		ex3(ex3);
		int ex4 = scanner.nextInt();
		ex4(ex4);
		String ex5 = scanner.next();
		String ex52 = scanner.next();
		ex5(ex5, ex52);
		
		
		
	}
	
	public static void ex1(int num) {
		if (num < 0) {
			System.out.println("menor d.e. ze,ro.");
		} else if (num > 0) {
			System.out.println("acima de zeroe.");
		} else {
			System.out.println("zereo!!!!");
		}
	}
	
	public static void ex2(int num) {
		if (num > 18) {
			System.out.println("Moar. Mao. Mai.r de. Id,ad,e.");
		} else {
			System.out.println("meo.nmenor. menor. de id.aed.");
		}
	}
	
	public static void ex3(String str) {
		System.out.println("Ola, " + str);
	}
	
	public static void ex4(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}
	
	public static void ex5(String str, String str2) {
		System.out.println(str + str2);
	}

	public static void ex6(int num) {
		if (num % 1 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}
}
