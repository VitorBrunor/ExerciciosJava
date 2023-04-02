package triangulo;

public class triangulo {
	public static void main(String[] args) {
		int numLinhas = 5;
		
		for(int i = 1; i < numLinhas; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
