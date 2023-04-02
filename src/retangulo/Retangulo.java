package retangulo;

public class Retangulo {
	private int altura;
	private int comprimento;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public Retangulo(int altura, int comprimento) {
		this.altura = altura;
		this.comprimento = comprimento;
		int area = (altura*comprimento);
		System.out.println("A altura do Retangulo é: " + altura);
		System.out.println("O comprimento do Retangulo é: " + comprimento);
		System.out.println("A área do Retangulo é: " + area);
	}
}