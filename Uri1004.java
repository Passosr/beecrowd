package iniciante;

import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {
		
		int a, b, produto;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		produto = a * b;
		
		System.out.println("PROD = " + produto);
		
		scanner.close();
			
	}

}
