package primeiroProjeto;

import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		//exercício 1
		Scanner scanner = new Scanner(System.in);
		int ex1num1;
		int ex1num2;
		System.out.println("Digite um número: ");
		ex1num1 = scanner.nextInt();
		System.out.println("Digite outro número: ");
		ex1num2 = scanner.nextInt();
		int ex1soma = ex1num1 + ex1num2;
		System.out.println("A soma desses numero ai é " + ex1soma);
		// exercício 2
		int ex2num1;
		int ex2num2;
		System.out.println("Digite um número: ");
		ex2num1 = scanner.nextInt();
		System.out.println("Digite outro número: ");
		ex2num2 = scanner.nextInt();
		double ex2div = ex2num1 / ex2num2;
		System.out.println("Esse é o resultado: "+ ex2div);
		// exercício 3
		double ex3num1;
		double ex3num2;
		double ex3num3;
		System.out.println("Digite um número: ");
		ex3num1 = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		ex3num2 = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		ex3num3 = scanner.nextDouble();
		double ex3per = ex3num1 + ex3num2 + ex3num3;
		System.out.println("Esse é o perimetro mano:" + ex3per);
		// exercício 4
		double ex4conta;
		double ex4perc;
		double ex4gorjeta;
		double ex4total;
		System.out.println("Digite quanto a conta deu: ");
		ex4conta = scanner.nextDouble();
		System.out.println("Digite qual porcentagem de gorjeta você quer dar: ");
		ex4perc = scanner.nextDouble();
		ex4gorjeta = ex4conta * (ex4perc / 100);
		System.out.println("Você dara R$" + ex4gorjeta + "de gorjeta.");
		ex4total = ex4conta + ex4gorjeta;
		System.out.println("O total sera: " + ex4total);
		//exercício 5
		double ex5raio;
		double ex5raio2;
		double ex5area;
		System.out.println("Digite um numero: ");
		ex5raio = scanner.nextDouble();
		System.out.println("Digite outro numero: ");
		ex5raio2 = scanner.nextDouble();
		ex5area = 3.14159 * ex5raio * ex5raio2;
		System.out.println("Aqui esta a area:");
		//exercicio 6
		int ex6anos;
		int ex6meses;
		int ex6dias;
		int ex6total;
		System.out.println("Por quantos anos você teve vida nessa terra?");
		ex6anos = scanner.nextInt();
		System.out.println("Por quantos meses você teve vida nessa terra?");
		ex6meses = scanner.nextInt();
		System.out.println("Por quantos dias você teve vida?");
		ex6dias = scanner.nextInt();
		ex6total = (ex6anos * 365) + (ex6meses * 30) + ex6dias;
		System.out.println("Você viveu " + ex6total);
		//exercio7
		int ex7horas;
		double ex7pago;
		double ex7salbru;
		double ex7imp;
		double ex7salliq;
		System.out.println("Digite quantas horas você trabalhou: ");
		ex7horas = scanner.nextInt();
		System.out.println("Digite quanto você é pago por hora: ");
		ex7pago = scanner.nextDouble();
		ex7salbru = ex7horas * ex7pago;
		ex7imp = ex7salbru * 0.10;
		ex7salliq = ex7salbru - ex7imp;
		System.out.println("Seu salario bruto é R$" + ex7pago + " e o imposto é R$" + ex7imp + " então você recebera R$" + ex7salliq);
	}

}
