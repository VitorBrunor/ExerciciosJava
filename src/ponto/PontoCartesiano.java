package ponto;
import java.util.Scanner;
public class PontoCartesiano {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a coordenada X: ");
		int x = scanner.nextInt();
		System.out.println("Entre com a coordenada Y: ");
		int y = scanner.nextInt();
		
		Ponto ponto;
		ponto = new Ponto(x, y);
	}

}
