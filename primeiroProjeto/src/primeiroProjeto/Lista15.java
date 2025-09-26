package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1\\
		String[] frutas = new String[5];
		for (int ex1 = 0; ex1 < frutas.length; ex1++) {
			System.out.println("digite friuta");
			frutas[ex1] = scanner.next();
		}
		for (int ex11 = 0; ex11 < frutas.length; ex11 ++) {
			System.out.println(frutas[ex11]);
		}
		//2\\
		int[] ex2 = new int[10];
		for (int ex1 = 0; ex1 < ex2.length; ex1++) {
			System.out.println("digite numero");
			ex2[ex1] = scanner.nextInt();
		}
		for (int ex11 = 0; ex11 < ex2.length; ex11 ++) {
			System.out.println(ex2[ex11]);
		}
		//3\\
		int[] ex3 = new int[7];
		for (int ex1 = 0; ex1 < ex3.length ; ex1++) {
			System.out.println("digite numero");
			ex3[ex1] = scanner.nextInt();
		}
		for (int ex11 = 6; ex11 >= ex3.length; ex11 --) {
			System.out.println(ex3[ex11]);
		}
		//4\\
		int[] ex4 = new int[10];
		for (int ex1 = 0; ex1 < ex4.length ; ex1++) {
			System.out.println("digite numero");
			ex4[ex1] = scanner.nextInt();
			if (ex4[ex1] > 100) {
				System.out.println("maior que 100");
				ex1 =- 1;
			}
		}
		for (int ex11 = 0; ex11 < ex4.length; ex11 ++) {
			System.out.println(ex4[ex11]);
		}
//		5 - Procurando um valor no vetor
		
		int[] vetor = new int[8];
		for(int e= 0;e<8;e++) {
			System.out.println("digite um numero: ");
			vetor[e] = scanner.nextInt();
		}
		System.out.println("Qual valor voce quer ver: ");
		int escolha = scanner.nextInt();
		if(escolha <=7) {
			System.out.println(vetor[escolha]);
		}else {
			System.out.println("fora de escopo");
		}
		
//		6 - Nome e idade de 5 pessoas
		String[] nome = new String[5];
		int[] idade = new int[5];
		for(int e = 0;e <5;e++) {
			System.out.println("Qual e o seu nome: ");
			nome[e] = scanner.next();
			System.out.println("Qual e a sua idade: ");
			idade[e] = scanner.nextInt();
		}
		for(int e = 0;e <5;e++) {
			System.out.println(nome[e]+" tem "+idade[e]+" anos");
		}
		
//		7 - Identificação de idade
		int[] velice = new int[10];
		for(int e =0;e <5;e++){
			System.out.println("Qual é a sus idade: ");
			velice[e] = scanner.nextInt();
			if(velice[e] < 18) {
				System.out.println("você é menor de idade");
			}
		}
		
//		8 - Aumento em massa
		int[] salario = new int[7];
		for(int e =0;e<7;e++) {
			System.out.println("Qual e o seu salario atual: ");
			salario[e] = scanner.nextInt();
			if(salario[e] <=2500) {
				System.out.println("você receberá um aumento");
			}
		}
	}

}