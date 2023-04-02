package idade;
import java.util.Scanner;

public class ComparaIdade {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome(null);
		pessoa1.setIdade(0);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome(null);
		pessoa2.setIdade(0);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome(null);
		pessoa3.setIdade(0);
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome da pessoa 1: ");
		pessoa1.setNome(scanner.next());
		System.out.println("Entre com a idade da pessoa 1: ");
		pessoa1.setIdade(scanner.nextInt());
		
		System.out.println("Entre com o nome da pessoa 2: ");
		pessoa2.setNome(scanner.next());
		System.out.println("Entre com a idade da pessoa 2: ");
		pessoa2.setIdade(scanner.nextInt());
		
		System.out.println("Entre com o nome da pessoa 3: ");
		pessoa3.setNome(scanner.next());
		System.out.println("Entre com a idade da pessoa 3: ");
		pessoa3.setIdade(scanner.nextInt());
		
		if(pessoa1.getIdade() > pessoa2.getIdade()) {
			pessoa1.ExibirDados(null, 0);
		}
		
	}
}
