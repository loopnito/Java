package poo;
import java.util.Scanner;

public class Cachorrop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cachorro dog = new Cachorro();
		dog.nome = "John Arbuckle";
		dog.idade = 10000;
		dog.latir();
		
		Cachorro chacorro = new Cachorro();
		System.out.println("Digite o nome do pet!");
	}

}
