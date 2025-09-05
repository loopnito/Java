package primeiroProjeto;

import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1
		System.out.println("numero 1 a 7");
		int opcao = scanner.nextInt();
		switch(opcao){
		case 1:
			System.out.println("dia util");
		case 2:
			System.out.println("dia util");
		case 3:
			System.out.println("dia util");
		case 4:
			System.out.println("dia util");
		case 5:
			System.out.println("dia util");
		case 6:
			System.out.println("fim de semana");
		case 7:
			System.out.println("fim de semana");
		default:
			System.out.println("Dia inválido");
		}
		
		//2
		System.out.println("1 = Café, 2 = Chá, 3 = Suco, 4 = Refrigerante");
		int opcao2 = scanner.nextInt();
		switch(opcao2){
		case 1:
			System.out.println("R$5,00");
		case 2:
			System.out.println("R$3,50");
		case 3:
			System.out.println("R$4,00");
		case 4:
			System.out.println("R$4,50");
		default:
			System.out.println("Dia inválido");
		}
		
		//3
		System.out.println("escolha veiculo");
		int opcao3 = scanner.nextInt();
		switch(opcao3){
		case 1:
			System.out.println("carro leve");
		case 2:
			System.out.println("moto motocicleta");
		case 3:
			System.out.println("caminhão pesado");
		default:
			System.out.println("Plano inválido");
		}
		//4
		System.out.println("escolha plano");
		int opcao4 = scanner.nextInt();
		switch(opcao4){
		case 1:
			System.out.println("Básico = Acesso limitado");
		case 2:
			System.out.println("Intermediário = Acesso padrão + suporte");
		case 3:
			System.out.println("Premium = Acesso total + suporte prioritário");
		default:
			System.out.println("Plano inválido");
		}
		//5
		System.out.println("numero 1 a 7");
		int opcao5 = scanner.nextInt();
		switch(opcao5){
		case 1,2,12:
			System.out.println("verão");
		case 3,4,5:
			System.out.println("Outono");
		case 6,7,8:
			System.out.println("Inverno");
		case 9,10,11:
			System.out.println("Primavera");
		default:
			System.out.println("mes invalido");
		}
		//6
		System.out.println("escolha ingresso");
		int opcao6 = scanner.nextInt();
		switch(opcao6){
		case 1:
			System.out.println("Inteira");
		case 2:
			System.out.println("Meia-entrada");
		case 3:
			System.out.println("VIP");
		default:
			System.out.println("inválido");
		}
		//7
		System.out.println("1 = Português, 2 = Inglês, 3 = Espanhol");
		int opcao7 = scanner.nextInt();
		switch(opcao7){
		case 1:
			System.out.println("Olá!");
		case 2:
			System.out.println("Hello!");
		case 3:
			System.out.println("Hola!");
		default:
			System.out.println("inválido");
		}
		
		//8
		System.out.println("1 = Usuário, 2 = Moderador, 3 = Administrador");
		int opcao8 = scanner.nextInt();
		switch(opcao8){
		case 1:
			System.out.println("Acesso básico!");
		case 2:
			System.out.println("Acesso básico + edição!");
		case 3:
			System.out.println("Acesso total!");
		default:
			System.out.println("inválido");
		}
		
		//9
		System.out.println("1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix");
		int opcao9 = scanner.nextInt();
		switch(opcao9){
		case 1:
			System.out.println("Pagamento em dinheiro confirmado!");
		case 2:
			System.out.println("Pagamento com cartão processado!");
		case 3:
			System.out.println("Pagamento via Pix realizado!");
		default:
			System.out.println("inválido");
		}	}

}
