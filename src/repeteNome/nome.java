package repeteNome;
import java.util.Scanner;

public class nome {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o nome: ");
		String nome = scanner.next();
		pessoa vitor = new pessoa(nome);
		
		for(i = 0; i < 100; i++) {
			System.out.println(vitor.nome);
		}
	}
}
