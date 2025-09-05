package primeiroProjeto;

import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1\\
		
		int idade;
		System.out.println("didigte idade");
		idade = scanner.nextInt();
		if(idade >= 18) {
			System.out.println("Você tem" + idade + ". Você é maior de idade.");
		} else {
			System.out.println("Você tem" + idade + ". Você é menor de idade.");
		}
		
		//2\\
		
		int ex2num1;
		int ex2num2;
		System.out.println("fale primeiro num");
		ex2num1 = scanner.nextInt();
		System.out.println("fale segundo num");
		ex2num2 = scanner.nextInt();
		if(ex2num1 > ex2num2) {
			System.out.println("primeiro numbero maior");
		} else {
			System.out.println("segundo numero maior ou eles iguais");
		}
		
		//3\\
		
		int ex3nota;
		System.out.println("fale sua nota");
		ex3nota = scanner.nextInt();
		if(ex3nota > 7) {
			System.out.println("Aprovado: sua nota foi " + ex3nota);
		} else {
			System.out.println("Reprovado: sua nota foi " + ex3nota);
		}
		
		//4\\
		
		int ex4num;
		System.out.println();
		ex4num = scanner.nextInt();
		if (ex4num > 0) {
			System.out.println("nomero é positivo");
		} else {
			System.out.println("nomero é negativo ou zero");
		}
		
		//5\\
		
		int ex5km;
		double calculo;
		System.out.println("digite distnacia");
		ex5km = scanner.nextInt();
		calculo = ex5km * 0.5;
		if(ex5km <= 50) {
			System.out.println("valor frete é 10 pila");
		} else {
			System.out.println("valor frete R$" + calculo);
		}
		
		//6\\
		
		int ex6num;
		System.out.println("numero digit");
		ex6num = scanner.nextInt();
		if(ex6num == 10) {
			System.out.println("numero é 10");
		} else {
			System.out.println("numero n é 10");
		}
		
		//7\\
		
		String ex7;
		System.out.println("associado?");
		ex7 = scanner.next();
		if(ex7 != "não") {
			System.out.println("você tem disconto");
		} else {
			System.out.println("você não tem disconto");
		}
		
		//8\\
		
		int ex8hora;
		System.out.println("fale horas");
		ex8hora = scanner.nextInt();
		if(ex8hora < 10) {
			System.out.println("bonus de R$ 20 por hora extra");
		} else {
			System.out.println("bonus de R$ 15 por hora extra");
		}
		
		
	}

}
