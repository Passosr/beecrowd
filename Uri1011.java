package iniciante;

import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		
		double raio, volume;
		Scanner scanner = new Scanner(System.in);
		
		raio = scanner.nextDouble();
		
		volume = (4.0/3) * 3.14159 * Math.pow(raio, 3);
		
		System.out.printf("VOLUME %.3f\n", volume);
		
		scanner.close();
		

	}

}
