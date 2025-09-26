package primeiroProjeto;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] ex4 = new int[10];
		for (int ex1 = 0; ex1 < 10 ; ex1++) {
			System.out.println("digite numero");
			ex4[ex1] = scanner.nextInt();
			if (ex4[ex1] > 100) {
				System.out.println("maior que 100");
				ex1 =- 1;
			}
		}
		for (int ex11 = 6; ex11 >= 0; ex11 --) {
			System.out.println(ex4[ex11]);
		}
		
	}

}
