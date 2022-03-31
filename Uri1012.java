package iniciante;

import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		
		double A, B, C, tri, cir, tra, qua, ret;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();
		
		tri = A * C / 2;
		cir = 3.14159 * C * C;
		tra = (A + B) / 2 * C;
		qua = B * B;
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);
		
		scanner.close();		

	}

}
