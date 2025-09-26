package primeiroProjeto;

import java.util.Scanner;

public class Lista16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//1
		String[] sixpos = new String [6];
		for (int i = 0; i < sixpos.length; i++) {
			System.out.println("digite cores");
			sixpos[i] = scanner.next();
		};
		for (int i = 0; i < sixpos.length; i++) {
			System.out.println(sixpos[i]);
		}
		
	}

}
