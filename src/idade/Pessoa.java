package idade;

public class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
		nome = null;
		idade = 0;
	}
	
	public static void ExibirDados(String nome, int idade) {
		System.out.println("O nome é: " + nome);
		System.out.println("A idade é: " + idade);
	}
	
}
