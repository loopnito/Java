package primeiroProjeto;

import java.util.Scanner;

public class Lista11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		


		


		// 1 - Contador:
				int contagem = 1;
				 do {
					System.out.println(contagem);
					contagem = contagem +2;
				}while (contagem <=31);

//				 2 - Adivinhação de número:
				 int teste;
				 do {
					System.out.println("Escrava um numero:");
					teste = scanner.nextInt();
				 }while (teste <=100);
				 
					//3
					int ex3;
					do {
						System.out.println("digite um numero");
						ex3 = scanner.nextInt();
						if (ex3 == 2) {
							System.out.println("você resolveu parar");
							break;
						} else {
							System.out.println("invalido");
							continue;
						}
					} while (ex3 == 1);
					
				 
				 
//				 4 - Classificação de números:
				 contagem = 1;
				 int tipo;
				 
				 do {
					 System.out.println("digite um numero: ");
					 tipo = scanner.nextInt();
					 if(tipo <= 10){
						 System.out.println("Tipo A");
					 }else if(tipo <= 20) {
						 System.out.println("Tipo B");
					 }else {
						 System.out.println("Fora de Categoria");
					 } contagem ++;
				 }while(contagem <= 5);
				 
//				 5 - Temperatura do forno:
				 
				 int temp;
				 do {
					 System.out.println("Atemperatura do forno precisa estar em 200 C°");
					 System.out.println("Qual e a temperatura do forno");
					 temp = scanner.nextInt();
				 }while (temp > 200);
				 
					//6
					int ex6;
					do {
						System.out.println("fale percentagem da bateria");
						ex6 = scanner.nextInt();
						if (ex6 <= 20) {
							System.out.println("bateria baixa");
							continue;
						} else {
							System.out.println("bateria alta");
							break;
						}
					} while (ex6 <= 20);
				 
					//7
					int ex7 = 1;
					int ex71;
					int ex72 = 0;
					String ex7res;
					System.out.println("quer fazer conta");
					ex7res = scanner.next();
					if (ex7res.equalsIgnoreCase("sim")) {
						do {
							System.out.println("Numero");
							ex71 = scanner.nextInt();
							ex72 += ex71;
							System.out.println(ex72);
							ex7 += 1;
						} while (ex7 <= 2);
					} else {
						System.out.println("beleza");
					}
	}

}
