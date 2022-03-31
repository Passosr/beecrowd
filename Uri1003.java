package iniciante;

import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {
		
		int a, b, soma;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		scanner.close();
		
	}

}
