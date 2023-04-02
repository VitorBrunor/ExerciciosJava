package animais;

public class Animal {
	private String nome;
	private String tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public static void ExibirAnimal(String nome, String tipo) {
		System.out.println("O nome do aninal é: " + nome);
		System.out.println("O tipo do aninal é: " + tipo);
	}
}
