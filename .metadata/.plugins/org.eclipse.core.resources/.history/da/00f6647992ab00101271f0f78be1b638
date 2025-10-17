package primeiroProjeto;

import java.util.Scanner;

public class Lista20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		saudacao();
		retangulo();
		multiplo();
		meses();
		
		int inte = scanner.nextInt();
		divisivel(inte);
		String str = scanner.next();
		mensagem(str);
		str = scanner.next();
		String str1 = scanner.next();
		nomes(str,str1);
		inte = scanner.nextInt();
		ver(inte);
		inte = scanner.nextInt();
		vel(inte);
		str = scanner.next();
		dds(str);
		inte = scanner.nextInt();
		sde(inte);
	}

	public static void saudacao() {
		for (int i = 0; i < 5; i ++) {
			System.out.println("Bom dia!");
		}
	}
	public static void retangulo() {
		for (int i = 0; i < 3; i ++) {
			System.out.println("*****");
		}
	}
	public static void multiplo() {
		for (int i = 5; i <= 25; i += 5) {
			System.out.println(i);
		}
	}
	public static void contagem() {
		for (int i = 1; i <= 8; i += 1) {
			System.out.println(i);
		}
		System.out.println("pronto");
	}
	public static void meses() {
		String[] meses =  {"Janeiro","Fevereiro","Março","Abril","Maio","Junho"};
		for (int i = 0;i < meses.length; i ++) {
			System.out.println(meses[i]);
		}
	}
	//parametro
	public static void divisivel(int div) {
		if (div % 5 == 0) {
			System.out.println("DIVISIVEL.");
		} else {
			System.out.println("Não divisivel :(");
		}
	}
	public static void mensagem(String nome) {
		System.out.println("Até logo, " + nome + "!");
	}
	public static void nomes(String primeiro, String segundo) {
		System.out.println(primeiro + " " + segundo);
	}
	public static void ver(int vvv) {
		if (vvv > 100) {
			System.out.println("maior");
		} else {
			System.out.println("menor");
		}
	}
	public static void vel(int vel) {
		if (vel < 40) {
			System.out.println("lento");
		} else if (vel < 80) {
			System.out.println("normal");
		} else {
			System.out.println("rapida");
		}
	}
	public static void dds (String dia) {
		System.out.println("Tenha uma ótima " + dia);
	}
	public static void sde (int qnt) {
		if (qnt < 5) {
			System.out.println("critico");
		} else if (qnt < 10) {
			System.out.println("baixo");
		} else {
			System.out.println("suficiente");
		}
	}
	
}
