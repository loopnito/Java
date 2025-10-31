package encapsulamento;

public class AvaliacaoP {
	
	Avaliacao avl = new Avaliacao();
	
	public static void main(String[] args) {
		
		Avaliacao avl = new Avaliacao();
		
		avl.setNota1(8);
		avl.setNota2(9);
		avl.setNome("Lonas");
		System.out.println("Nome do aluno: "+avl.getNome()+"\r\n Media: "+ avl.media());
		avl.setNota1(6);
		avl.setNota2(7);
		avl.setNome("SS");
		System.out.println("Nome do aluno: "+avl.getNome()+"\r\n Media: "+ avl.media());
		avl.setNota1(525356);
		avl.setNota2(23424252);
		avl.setNome("ergergef");
		System.out.println("Nome do aluno: "+avl.getNome()+"\r\n Media: "+ avl.media());
		avl.setNota1(-6756);
		avl.setNota2(-998);
		avl.setNome("eweg");
		System.out.println("Nome do aluno: "+avl.getNome()+"\r\n Media: "+ avl.media());
	}

}
