package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá Mundo");
		
		//Declaração de variável
		int idade = 24;
		double salario = 2000.50;
		char letra = 'J';
		String nome = "Juliana";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O seu salario é " + salario);
		System.out.println("Letra: " + letra);
		System.out.println("O nome é: " + nome);
		System.out.println(chuva);
		
		//Operações matematicas
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Substração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		System.out.println("Resto: " + resto);
		
		//Entrada de Dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é o seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá " + nome1);
		
		//Soma de dois numeros
		int numero1;
		int numero2;
		System.out.println("Fale um numero ai parsa ");
		numero1 = scanner.nextInt();
		System.out.println("Fala outro numero ai amigão");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("Ow parsa, o resultado é: " + soma1);
		
		//Peça o ano de nascimento do usuário e mostre quantos anos ele tem
		int anonasc;
		System.out.println("Fale seu ano de nascimento, doido");
		anonasc = scanner.nextInt();
		int anoscalc = 2025 - anonasc;
		System.out.println("Tua idade é "+anoscalc);
		
		
	}

}
