package encapsulamento;

import java.util.Scanner;

public class AlunoP {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Aluno aln = new Aluno();
		
		System.out.println("Diga nome aluno");
		aln.setNome(scn.next());
		System.out.println("Diga idade aluno");
		aln.setIdade(scn.nextInt());
		System.out.println("Aluno é "+aln.getNome() + ", com "+aln.getIdade()+" anos.");

	}

}
