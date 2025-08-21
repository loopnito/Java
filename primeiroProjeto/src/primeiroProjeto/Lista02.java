package primeiroProjeto;

import java.util.Scanner;

public class Lista02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1\\
		
		int ex1num1;
		int ex1num2;
		int ex1soma;
		int ex1sub;
		int ex1mul;
		double ex1div;
		System.out.println("Fale um numero");
		ex1num1 = scanner.nextInt();
		System.out.println("Fale outro numero");
		ex1num2 = scanner.nextInt();
		ex1soma = ex1num1 + ex1num2;
		ex1sub = ex1num1 - ex1num2;
		ex1mul = ex1num1 * ex1num2;
		ex1div = ex1num1 / ex1num2;
		System.out.println(ex1div + ex1mul + ex1soma + ex1sub);
		
		//2\\
		
		double ex2cel;
		double ex2fah;
		System.out.println("Fale a temperatura em Celsius");
		ex2cel = scanner.nextDouble();
		ex2fah = (ex2cel * 1.8) + 32;
		System.out.println(ex2fah);
		
		//3\\
		
		double ex3real;
		double ex3total;
		System.out.println("Fale quantos reals tu tem");
		ex3real = scanner.nextDouble();
		ex3total = ex3real / 5.7;
		System.out.println(ex3total);
		
		//4\\
		
		double ex4base;
		double ex4alt;
		double ex4total;
		System.out.println("fale a base");
		ex4base = scanner.nextDouble();
		System.out.println("fale a altura");
		ex4alt = scanner.nextDouble();
		ex4total = ex4base * ex4alt;
		System.out.println(ex4total);
		
		//5\\
		
		int ex5anos;
		System.out.println("Quantos anos de vida você tem");
		ex5anos = scanner.nextInt();
		double ex5meses;
		ex5meses = ex5anos * 12;
		System.out.println(ex5meses);
		
		//6\\
		
		int ex6min;
		System.out.println("fale minutos");
		ex6min = scanner.nextInt();
		int ex6sec;
		ex6sec = ex6min * 60;
		System.out.println(ex6sec);
		
		//7\\
		
		int ex7prec;
		int ex7quant;
		System.out.println("fale quao caro");
		ex7prec = scanner.nextInt();
		System.out.println("fale quanto");
		ex7quant = scanner.nextInt();
		int ex7total;
		ex7total = ex7prec * ex7quant;
		System.out.println(ex7total);
		
		//8\\
		
		double ex8valor;
		int ex8pessoas;
		System.out.println("fale o valor");
		ex8valor = scanner.nextDouble();
		System.out.println("fale quantas pessoas");
		ex8pessoas = scanner.nextInt();
		double ex8total;
		ex8total = ex8valor / ex8pessoas;
		System.out.println("Cada pessoa deve pagar R$" + ex8total);
		
		//9\\
		
		double ex9comp;
		double ex9pago;
		double ex9total;
		System.out.println("fale compra");
		ex9comp = scanner.nextDouble();
		System.out.println("fale cliente");
		ex9pago = scanner.nextDouble();
		ex9total = ex9comp - ex9pago;
		System.out.println(ex9total);
	}

}
