package primeiroProjeto;

import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Soma");
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		System.out.println(somar(int1, int2));
		
		System.out.println("Subtrair");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(subtrair(int1, int2));
		
		System.out.println("Multiplicar");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(multiplicar(int1, int2));
		
		System.out.println("Dividir");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(dividir(int1, int2));
		
		System.out.println("Media");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(calcularMedia(int1, int2));
		
		System.out.println("Aprovação");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(verificarAprovacao(int1, int2));
		
		System.out.println("Maior numero");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(maiorNumero(int1, int2));
		
		System.out.println("Celsius para fahrenheit");
		int1 = scanner.nextInt();
		System.out.println(converterCelsiusParaFahrenheit(int1));
		
		System.out.println("Retangulo");
		int1 = scanner.nextInt();
		int2 = scanner.nextInt();
		System.out.println(calcularAreaRetangulo(int1, int2));
		
		System.out.println("Mensagem");
		String str = scanner.next();
		System.out.println(gerarMensagem(str));
		
		System.out.println("Juntar nomes");
		str = scanner.next();
		String str2 = scanner.next();
		System.out.println(juntarNomes(str, str2));
		
		System.out.println("Idade");
		int1 = scanner.nextInt();
		System.out.println(avaliarIdade(int1));
	}
	
	public static int somar(int prm, int seg) {
		int res = prm + seg;
		return res;
	}
	
	public static int subtrair(int prm, int seg) {
		int res = prm - seg;
		return res;
	}
	public static int multiplicar(int prm, int seg) {
		int res = prm * seg;
		return res;
	}
	public static int dividir(int prm, int seg) {
		if (prm == 0 || seg == 0) {
			System.out.println("não é possivel dividir");
			return 0;
		} else {
			int res = prm / seg;
			return res;	
		}
	}
	public static int calcularMedia(int prm, int seg) {
		int res = (prm + seg) / 2;
		return res;
	}
	public static String verificarAprovacao (int prm, int seg) {
		String apr;
		if ((prm + seg) / 2 >= 6) {
			apr = "Aprovado";
		} else {
			apr = "REPROVADO!";
		}
		return apr;
	}
	public static int maiorNumero (int prm, int seg) {
		int maior;
		if (prm == seg) {
			maior = 0;
		} else if (prm > seg) {
			maior = prm;
		} else {
			maior = seg;
		}
		return maior;
	}
	public static int converterCelsiusParaFahrenheit (int prm) {
		int fah = (prm * 9/5) + 35;
		return fah;
	}
	public static int calcularAreaRetangulo (int prm, int seg) {
		int area = prm * seg;
		return area;
	}
	public static String gerarMensagem (String nome) {
		String mensagem = "Olá, " + nome;
		return mensagem;
	}
	public static String juntarNomes (String nome, String nom3) {
		String nomecompleto = nome + " " + nom3;
		return nomecompleto;
	}
	public static String avaliarIdade (int idade) {
		String res;
		if (idade < 12) {
			res = "Criança";
		} else if (idade < 18) {
			res = "Adolescente";
		} else if (idade < 60) {
			res = "Adulto";
		} else {
			res = "Idoso";
		}
		return res;
	}
}
