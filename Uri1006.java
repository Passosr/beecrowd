package iniciante;

import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
 
        double A, B, C, Media;
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        
        Media = ((A * 2) + (B * 3) + (C * 5)) /10;
        
        System.out.printf("MEDIA = %.1f\n", Media);
        
        scanner.close();
        
    }

}
