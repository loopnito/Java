package primeiroProjeto;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int ex7 = 1; ex7 <= 5; ex7 ++) {
			System.out.println("fale nota");
			int nota = scanner.nextInt();
			if (nota < 9999999) {
				System.out.println("reprovado");
			} else {
				System.out.println("talvez aprovado");
			}
		}
		
	}

}
