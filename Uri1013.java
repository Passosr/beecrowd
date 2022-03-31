package iniciante;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int maiorab, maiorbc;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		maiorab = (a + b + Math.abs(a - b))/2;
		
		maiorbc = (maiorab + c + Math.abs(maiorab - c))/2;
		
		System.out.println(maiorbc + " eh o maior");
		
		scanner.close();
	}

}
