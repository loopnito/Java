package primeiraLista;

import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		pizza.sabor = "Carne Misteriosa";
		pizza.tamanho = "Gigantesca";
		pizza.bordaRecheada  = true;
		pizza.preparar();
		pizza.assando();
		pizza.mostrarInformacoes();
		
		System.out.println("FALE SABOR");
		pizza.sabor = scanner.next();
		System.out.println("Fale TAMANHO");
		pizza.tamanho = scanner.next();
		System.out.println("Falar BORDA RECHEADA? TRUE OU FALSE.");
		pizza.bordaRecheada  = scanner.nextBoolean();
		pizza.preparar();
		pizza.assando();
		pizza.mostrarInformacoes();
	}

}
