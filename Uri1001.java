package iniciante;

import java.util.Scanner;

public class Uri1001 {

	public static void main(String[] args) {
		//Variáveis
		int A, B, X;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		//Processamento
		X = A + B;
		System.out.println("X = " + X);		
		
		teclado.close();
	}
	
}
