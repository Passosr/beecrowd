package iniciante;

import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {

		int cod, h_trab;
		double valor_h, salario;
		Scanner scanner = new Scanner(System.in);
		
		cod = scanner.nextInt();
		h_trab = scanner.nextInt();
		valor_h = scanner.nextDouble();
		
		salario = h_trab * valor_h;
		
		System.out.println("NUMBER = " + cod);
		System.out.printf("SALARY = %.2f\n", salario);
		
		scanner.close();
		

	}

}
