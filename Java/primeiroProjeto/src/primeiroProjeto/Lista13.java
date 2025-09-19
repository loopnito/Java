package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		for(int ex1 = 10; ex1 <= 30; ex1 ++) {
			System.out.println(ex1);
		};
		//2
		int iddex2;
		for(int ex2 = 0; ex2 <= 10; ex2 ++) {
			System.out.println("fale idade");
			iddex2 = scanner.nextInt();
			if (iddex2 < 18) {
				System.out.println("menor");
			} else {
				System.out.println("maior");
			};
		};
		//3
		for(int ex3 = 0; ex3 <= 5; ex3 ++) {
			System.out.println("fale seu voto maninho");
			int voto = scanner.nextInt();
			switch(voto){
			case 1,2,3,4: System.out.println("voto para os respectivos candidatos;"); break;
			case 5: System.out.println("voto nulo"); break;
			case 6: System.out.println("voto em branco"); break;
			default: System.out.println("invalido"); break;
			}
		};
		//4
		System.out.println("fale uma frase");
		String frase = scanner.next();
		System.out.println("fale quantas vezes isso deve se repetir");
		int reps = scanner.nextInt();
		for(int forloop = 0; forloop <= reps; forloop ++) {
			System.out.println(frase);
		};
		//5
		for(int ex5 = 50; ex5 >= 30; ex5 --) {
			System.out.println(ex5);
		}
		
		//6
		for(int ex6 = 1; ex6 <= 50; ex6 += 2) {
			System.out.println(ex6);
		}
		//7
		for(int ex7 = 1; ex7 <= 5; ex7 ++) {
			System.out.println("fale nota");
			int nota = scanner.nextInt();
			if (nota < 9999999) {
				System.out.println("reprovado");
			} else {
				System.out.println("talvez aprovado");
			}
		}
		//8
		for(int ex8 = 1; ex8 <= 5; ex8 ++) {
			System.out.println("fale idade");
			int idade = scanner.nextInt();
			if (idade < 12) {
				System.out.println("criança");
			} else if (idade < 18) {
				System.out.println("adoletces");
			} else if (idade < 60) {
				System.out.println("adulto");
			} else {
				System.out.println("idosol");
			}
		}
		//9
		for(int ex9 = 0; ex9 < 7; ex9 ++) {
			System.out.println("fale numero");
			int num = scanner.nextInt();
			if (num > 0) {
				System.out.println("positivo");
			} else if (num < 0) {
				System.out.println("negativo");
			} else {
				System.out.println("zero");
			}
		}
	}

}
