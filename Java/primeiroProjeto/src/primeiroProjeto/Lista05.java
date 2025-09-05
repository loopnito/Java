package primeiroProjeto;

import java.util.Scanner;

public class Lista05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1
		
		int ex1idd;
		System.out.println("Fale sua idade ai maninho");
		ex1idd = scanner.nextInt();
		if (ex1idd <= 12) {
			System.out.println("Criança. .");
		} else if (ex1idd <= 17) {
			System.out.println("Adolescente. .");
		} else if (ex1idd <= 59) {
			System.out.println("Adulto. .");
		} else {
			System.out.println("Idoso.");
		}
		
		//2
		
		int ex2cel;
		System.out.println("digite a temperatura em celsius");
		ex2cel = scanner.nextInt();
		if (ex2cel <= 10) {
			System.out.println("carambolas ta tipo MUITO frio");
		} else if (ex2cel <= 20) {
			System.out.println("caçamba ta um pouqinho frio né");
		} else if (ex2cel <= 30) {
			System.out.println("ta agradavel :]");
		} else {
			System.out.println("AAAA ALR RTAA ,MUITO QUENT");
		}
		
		//3
		
		int ex3;
		System.out.println("digite a nota");
		ex3 = scanner.nextInt();
		if (ex3 >= 90) {
			System.out.println("A. Parabens.");
		} else if (ex3 >= 80) {
			System.out.println("B. Paraben.");
		} else if (ex3 >= 70) {
			System.out.println("C. Parabe.");
		} else if (ex3 >= 60) {
			System.out.println("D. Parab.");
		}  else {
			System.out.println("F. Para.");
		}
		
		//4
		
		String ex4;
		System.out.println("digite a senha.");
		ex4 = scanner.next();
		if (ex4.equals("admin")) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso não permitido");
		}
		
		//5
		
		String ex5;
		String ex51;
		System.out.println("digite nome1");
		ex5 = scanner.next();
		System.out.println("digite nome2.");
		ex51 = scanner.next();
		if (ex5.equals(ex51)) {
			System.out.println("os nomes são iguais");
		} else {
			System.out.println("os nomes são diferentes");
		}
		
		//6
		
		String ex6;
		System.out.println("digite cor");
		ex6 = scanner.next();
		if (ex6.equalsIgnoreCase("azul")) {
			System.out.println("maravilhosa escolha.");
		} else if (ex6.equalsIgnoreCase("vermelho")) {
			System.out.println("cor vibrante!");
		} else if (ex6.equalsIgnoreCase("verde")) {
			System.out.println("cor da natureza!");
		} else {
			System.out.println("Cor não registrada.");
		}
		
		//7
		
		String ex7;
		System.out.println("digite letra");
		ex7 = scanner.next();
		if (ex7.equalsIgnoreCase("A" + "E" + "I" + "O" + "U")) {
			System.out.println(" Vogal");
		} else {
			System.out.println("Não vogal");
		}
	}

}
