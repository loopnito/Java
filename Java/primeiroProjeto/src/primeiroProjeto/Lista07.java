package primeiroProjeto;

import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		System.out.println("idade?");
		int ex1ida = scanner.nextInt();
		if (ex1ida < 16 || ex1ida > 70) {
			System.out.println("especial");
		} else {
			System.out.println("regular");
		}
		
		//2
		System.out.println("valor?");
		double ex2val = scanner.nextDouble();
		System.out.println("quantidade?");
		int ex2quan = scanner.nextInt();
		if (ex2val * ex2quan > 200 || ex2quan > 5) {
			System.out.printf("você ganhou 15% de desconto! ", ex2val * 0.85);
		} else {
			System.out.println("não ganhou desconto");
		}
		//3
		System.out.println("frequencia cardiaca?");
		int ex3car = scanner.nextInt();
		System.out.println("tontura? use true ou false");
		boolean ex3tor = scanner.nextBoolean();
		if (ex3car >= 100 || ex3tor == true) {
			System.out.println("procure atendimento medico");
		} else {
			System.out.println("sem sinais");
		}
		//4
		System.out.println("idade?");
		int ex4ida = scanner.nextInt();
		System.out.println("estado? true ou false");
		boolean ex4est = scanner.nextBoolean();
		if (ex4ida >= 18 && ex4est == true || ex4ida <= 30 && ex4est == true ) {
			System.out.println("elegivel para o concurso");
		} else {
			System.out.println("nao elegicel");
		}
		//5
		System.out.println("projetos?");
		int ex5pro = scanner.nextInt();
		System.out.println("erros?");
		int ex5err = scanner.nextInt();
		if (ex5pro > 10 || ex5err < 3) {
			System.out.println("recompesa concedida");
		} else {
			System.out.println("sem recompensa");
		}
		//6
		System.out.println("idade?");
		int ex6ida = scanner.nextInt();
		System.out.println("passport? true ou false");
		boolean ex6pas = scanner.nextBoolean();
		if (ex6ida >= 18 && ex6pas == true) {
			System.out.println("viagem autorizada");
		} else {
			System.out.println("não autorizada");
		}
		//7
		System.out.println("nota?");
		int ex7not = scanner.nextInt();
		System.out.println("aulas?");
		int ex7aul = scanner.nextInt();
		if (ex7not > 100 || ex7aul > 50 || ex7not < 0 || ex7aul < 0) {
			while (true) {
				System.out.println("Erro, tente novamente.");
				System.out.println("nota?");
				ex7not = scanner.nextInt();
				System.out.println("aulas?");
				ex7aul = scanner.nextInt();
				if (ex7not > 100 || ex7aul > 50 || ex7not < 0 || ex7aul < 0) {
					continue;
				} else {
					System.out.println("Erro corrigido.");
					break;
				}
			}
		}
		if (ex7not >= 70 && ex7aul >= 40) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
		//8
		System.out.println("umidade?");
		int um = scanner.nextInt();
		System.out.println("temperatura?");
		int temp = scanner.nextInt();
		if(um < 30 || temp > 30) {
			System.out.println("irrigação necessaria");
		} else {
			System.out.println("irrigação não necssaria");
		}
		
		//9
		System.out.println("Digite sua idade");
		int idade1 = scanner.nextInt();
		System.out.println("Tem experiencia/");
		boolean experiencia = scanner.nextBoolean();
		if (idade1 >= 20 && idade1 <= 40 && experiencia == true) {
			System.out.println("aceiot");
		} else {
			System.out.println("Condenado a prisão perpetua.");
		}
	}

}
