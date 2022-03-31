package iniciante;

import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double media;
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		media = x / y;
		
		System.out.printf("%.3f km/l", media);
		scanner.close();

	}

}
