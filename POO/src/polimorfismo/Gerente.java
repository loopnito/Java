package polimorfismo;

public class Gerente extends Funcionario {
	@Override
	public void exibirDados() {
		System.out.println("Nome: "+ getNome());
	}
}
