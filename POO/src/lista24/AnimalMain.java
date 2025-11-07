package lista24;

public class AnimalMain {

	public static void main(String[] args) {
		Gato cat = new Gato();
		Cachorro dog = new Cachorro();
		cat.setCor("Magenta");
		cat.setIdade(6215887);
		cat.setNome("Jobisklobis");
		cat.mostrarInfo();
		dog.setIdade(-392);
		dog.setRaca("Ancião das Trevas");
		dog.setNome("Bob");
		dog.mostrarInfo();
	}
	
}
