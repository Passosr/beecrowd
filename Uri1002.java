package iniciante;

import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		
		double raio, area, n = 3.14159;
		
		Scanner teclado = new Scanner(System.in);
		
		raio = teclado.nextDouble();
		
		area = n * (raio * raio);
		
		System.out.printf("A=%.4f\n", area);
		
		teclado.close();
	}

}
