package ponto;

public class Ponto {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Ponto(int x, int y) {;
		this.x = x;
		this.y = y;
		System.out.println("Você está em (" + x + ", " + y + ") no plano cartesiano");
	}
	
	public Ponto() {
		x = 0;
		y = 0;
	}
	
}
