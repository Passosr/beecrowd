package iniciante;

import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		
		double a, b, media;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		
		media = (a * 3.5)/11 + (b * 7.5)/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		scanner.close();
		
	}

}
