package primeiroProjeto;

import java.util.Scanner;

public class AlgumaCoisa {

	public static void main(String[] args) {
		
		System.out.print("Olá ");
		System.out.print("mundo \n");
		System.out.print("wiiikkkkkkk");
		
		int idade = 20;
		double salario = 2000.50;
		
		System.out.println("A idade é: " + idade);
		System.out.printf("A idade é: %d \n ", idade);
		System.out.printf("A idade é %d e o salário é %f \n", idade);
		System.out.println("A idade é" + idade + "e o salario é" + salario);
		
		// Comparação
		String senha = "1234";
		if (senha.equals("1234")) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
		
		String palavra = "java";
		String palavra2 = "java";
		if (palavra.equals(palavra2)) {
			System.out.println("foi");
		} else {
			System.out.println("Não foi");
		}
		
		Scanner scanner = new Scanner(System.in);
		String resposta = scanner.next();
		
		if (resposta.equalsIgnoreCase("java")) {
			System.out.println("Acertou");
		} else {
			System.out.println("  j       ");
		}
		
		String cor = scanner.next();
		if (cor.equalsIgnoreCase("azul")) {
			System.out.println("azul :]");
		} else if (cor.equalsIgnoreCase("verde")) {
			System.out.println("verde");
		} else {
			System.out.println("cor errada. prepare para ser executado, ou executada, ou executade? sei la... lacração ta forte.... :[");
		}
	}

}
