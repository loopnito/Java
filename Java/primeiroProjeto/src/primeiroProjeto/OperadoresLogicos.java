package primeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//1
		System.out.println("fale um numero");;
		int ex1 = scanner.nextInt();
		if(ex1 >= 10 && ex1 <= 20) {
			System.out.println("dentro do interlalol");
		} else {
			System.out.println("24/09/2028.");
		}
		
		//2
		System.out.println("quantos anos");
		int ex2anos = scanner.nextInt();
		System.out.println("TEM CONVITE????? USE 'true' OU 'false'");
		boolean ex2conv = scanner.nextBoolean();
		if(ex2anos >= 18 && ex2conv == true) {
			System.out.println("pode entrar maninho :)");
		} else {
			System.out.println("Se prepare.");
		}
		
		//3
		System.out.println("fale idade");
		int ex3ida = scanner.nextInt();
		if (ex3ida < 12 || ex3ida > 60) {
			System.out.println("você é especila :)");
		} else {
			System.out.println("Você não é especial.");
		}
		
		//4
		System.out.println("valor?");
		double ex4valor = scanner.nextDouble();
		System.out.println("foi avista? use 'true' ou 'false'");
		boolean ex4vista = scanner.nextBoolean();
		if (ex4valor >= 100 && ex4vista == true) {
			System.out.println("10% de desconto! " + ex4valor % 90);
		} else {
			System.out.println("sem desconto");
		}
		
		//5
		System.out.println("temperaturoa?");
		int ex5temp = scanner.nextInt();
		System.out.println("sintomas? true ou false");
		boolean ex5 = scanner.nextBoolean();
		if(ex5temp > 38 || ex5 == true) {
			System.out.println("procure medico");
		} else {
			System.out.println("não procure medico.");
		}
		
		//6
		System.out.println("idade?");
		int ex6 = scanner.nextInt();
		System.out.println("brasileiro?");
		boolean ex6t = scanner.nextBoolean();
		if (ex6 >= 16 && ex6t == true) {
			System.out.println("pode votar :)");
		} else {
			System.out.println("Não vote.");
		}
		
		//7
		System.out.println("horas extras?");
		int ex7 = scanner.nextInt();
		System.out.println("faltas?");
		int ex7f = scanner.nextInt();
		if (ex7 > 20 && ex7f < 5) {
			System.out.println("bonus!");
		} else {
			System.out.println("sem bonus");
		}
		
		//8
		System.out.println("carteira?");
		boolean ex8 = scanner.nextBoolean();
		System.out.println("faltas?");
		int ex8i = scanner.nextInt();
		if (ex8i >= 18 && ex8 == true) {
			System.out.println("dirija");
		} else {
			System.out.println("não dirija");
		}
		
		//9
		System.out.println("media?");
		int media = scanner.nextInt();
		System.out.println("faltas?");
		int falta = scanner.nextInt();
		if(media >= (0) && falta<(00)) {
			System.out.println("bolsa concedidade");
		} else {
			System.out.println("não");
		}
		
		//10
		
		System.out.println("umidade?");
		int umidade = scanner.nextInt();
		System.out.println("qual temperatura?");
		double temp = scanner.nextDouble();
		if(temp >=(18)&& temp<(26) && umidade >=60) {
			System.out.println("ajustar");
		} else {
			System.out.println("não ajustar");
		}
	}

}
