package primeiroProjeto;

import java.util.Scanner;

public class Lista18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();
		ex7();
		ex8();
		ex9();
		
	}
	
	public static void ex1() {
		for (int i = 0; i < 10; i ++) {
			System.out.println("Ola ViniciusCraft2009");
		}
	}
	
	public static void ex2() {
		System.out.println("uma frase motivacional");
	}
	
	public static void ex3() {
		for (int num = 1; num <= 10; num++) {
			System.out.println(num);
		}
	}
	
	public static void ex4() {
		System.out.println("a e i o u");
	}
	
	public static void ex5() {
		System.out.println("****");
		System.out.println("*  *");
		System.out.println("****");
	}
	
	public static void ex6() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
	}
	
	public static void ex7() {
		for (int i = 10; i >= 1; i --) {
			System.out.println(i);
		}
		System.out.println("fim!");
	}
	
	public static void ex8() {
		char[] hi = new char[5];
		for (int i = 0; i <= 4; i ++) {
			hi[i] = '*';
			System.out.println(java.util.Arrays.toString(hi));
		}
	}
	
	public static void ex9() {
		String[] semana = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado"};
		for (int i = 0; i < semana.length; i ++) {
			System.out.println(semana[i]);
		}
		
	}

}
