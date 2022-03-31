package iniciante;

import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		
		String nome;
		double vendas, salario, total;
		Scanner scanner = new Scanner(System.in);
		
		nome = scanner.next();
		salario = scanner.nextDouble();
		vendas = scanner.nextDouble();
		total = salario + (vendas * 15)/100;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		scanner.close();	 

	}

}
