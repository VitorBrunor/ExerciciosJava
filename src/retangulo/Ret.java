package retangulo;
import java.util.Scanner;

public class Ret {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a altura do retangulo");
		int a = scanner.nextInt();
		System.out.println("Entre com o comprimento do retangulo");
		int b = scanner.nextInt();
		
		Retangulo ret1;
		ret1 = new Retangulo(a, b);
		
	
	}
}