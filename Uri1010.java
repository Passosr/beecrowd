package iniciante;

import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		
		int cod1, cod2, p1, p2;
		double valor_p1, valor_p2, valor_total;
		Scanner scanner = new Scanner(System.in);
		
		cod1 = scanner.nextInt();
		p1 = scanner.nextInt();
		valor_p1 = scanner.nextDouble();
		
		cod2 = scanner.nextInt();
		p2 = scanner.nextInt();
		valor_p2 = scanner.nextDouble();
		
		valor_total = p1 * valor_p1 + p2 * valor_p2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_total);
		
		scanner.close();
	}

}
